package com.geoway.webstore;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lencho
 * @create 2021-08-18 19:29
 */
@SpringBootApplication
@EnableSwagger2Doc
public class LenchoProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(LenchoProvider8001.class, args);
    }
}
