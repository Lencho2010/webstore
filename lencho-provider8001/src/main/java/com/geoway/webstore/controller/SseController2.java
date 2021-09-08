package com.geoway.webstore.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.geoway.webstore.util.SseEmitters;
import lombok.extern.slf4j.Slf4j;
import org.postgresql.PGConnection;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Lencho
 * @create 2021-09-05 20:42
 * @desc
 */
@Slf4j
/*@RestController
@RequestMapping("/see")*/
public class SseController2 {

    private final SseEmitters emitters = new SseEmitters();

    private final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);

    private org.postgresql.PGConnection pgConn;

    @Resource
    public DruidDataSource dataSource;

    public SseController2() {
        broadcast();
    }

    // 建立SSE连接，这里为了简化，将JDBC连接通过URL参数传入，这样做是不安全的
    @RequestMapping(value = "/listen", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter listenToBroadcast() throws SQLException {
        this.initListener();
        return emitters.add();
    }

    private void initListener() throws SQLException {
        String dbUrl = dataSource.getUrl();
        String username = dataSource.getUsername();
        String password = dataSource.getPassword();

        Connection conn = DriverManager.getConnection(dbUrl, username, password);
        pgConn = conn.unwrap(org.postgresql.PGConnection.class);
        // 执行监听change_data_capture频道
        Statement stmt = conn.createStatement();
        stmt.execute("LISTEN change_data_capture");
        stmt.close();
    }

    // 初始化广播
    private void broadcast() {
        scheduledThreadPool.scheduleAtFixedRate(() -> {
            try {
                // 定时接收数据库通知
                org.postgresql.PGNotification[] notifications = null;
                try {
                    notifications = pgConn.getNotifications();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (notifications != null) {
                    for (org.postgresql.PGNotification notification : notifications) {
                        emitters.send(notification.getParameter());
                    }
                }
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

}
