package com.smart.cloud.config;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class SmartConfigApplication {
	public static void main(String[] args) {
		log.debug("SmartConfigApplication startup main");
		SpringApplication application = new SpringApplication(SmartConfigApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
