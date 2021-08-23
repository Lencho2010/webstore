package com.geoway.webstore.controller;

import com.geoway.webstore.anno.ResponseResult;
import com.geoway.webstore.entities.Payment;
import com.geoway.webstore.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Lencho
 * @create 2021-08-18 19:50
 */
@RestController
@Slf4j
@RequestMapping("/payment")
@ResponseResult
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public int create(@RequestBody Payment payment) {
        log.info("*******插入结果：");

        return paymentService.create(payment);
    }

    @PostMapping("/create2")
    public int create2(@RequestParam Long id,
                       @RequestParam String serial) {
        log.info("*******插入结果：");

        return paymentService.create(new Payment(id, serial));
    }

    @GetMapping("/get/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id) {
        log.info("查询数据...");
        return paymentService.getPaymentById(id);
    }
}
