package com.geoway.webstore.controller;

import com.geoway.webstore.event.PayCompletedEvent;
import com.geoway.webstore.listener.PayCompletedListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.annotation.Resource;

/**
 * @author Lencho
 * @create 2021-09-05 22:14
 * @desc
 */
@RestController
@RequestMapping("/sse")
public class SseController {

    @Resource
    ApplicationContext applicationContext;

    @Resource
    PayCompletedListener payCompletedListener;

    @GetMapping("/push")
    public SseEmitter push(@RequestParam Long payRecordId) {
        final SseEmitter emitter = new SseEmitter();
        try {
            payCompletedListener.addSseEmitters(payRecordId, emitter);
        } catch (Exception e) {
            emitter.completeWithError(e);
        }

        return emitter;
    }

    @GetMapping("/pay-callback")
    public String payCallback(@RequestParam Long payRecordId) {
        applicationContext.publishEvent(new PayCompletedEvent(this, payRecordId));
        return "请到监听处查看消息";

    }

}
