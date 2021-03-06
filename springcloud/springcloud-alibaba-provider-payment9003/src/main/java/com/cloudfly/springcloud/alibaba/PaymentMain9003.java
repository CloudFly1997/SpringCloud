package com.cloudfly.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-05-31 11:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9003 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9003.class, args);
	}
}
