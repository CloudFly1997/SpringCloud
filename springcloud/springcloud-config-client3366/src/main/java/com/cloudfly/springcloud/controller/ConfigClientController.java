package com.cloudfly.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-05-18 14:25
 */
@RestController
@RefreshScope
public class ConfigClientController {
	@Value("${server.port}")
	private String serverPort;

	@Value("${config.info}")
	private String configInfo;

	@GetMapping("/configInfo")
	public String getConfigInfo() {
		return "端口号：" + serverPort + " 配置文件信息：" + configInfo;
	}
}
