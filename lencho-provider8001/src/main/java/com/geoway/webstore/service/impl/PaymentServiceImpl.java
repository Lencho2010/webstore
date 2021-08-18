package com.geoway.webstore.service.impl;

import com.geoway.webstore.dao.PaymentDao;
import com.geoway.webstore.entities.Payment;
import com.geoway.webstore.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lencho
 * @create 2021-08-18 19:48
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
