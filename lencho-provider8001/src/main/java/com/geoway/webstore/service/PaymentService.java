package com.geoway.webstore.service;

import com.geoway.webstore.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Lencho
 * @create 2021-08-18 19:48
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
