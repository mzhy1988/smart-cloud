package com.smart.cloud.eureka;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class SmartEurekaApplication {
	 public static void main(String[] args) {
	        log.debug("SmartEurekaApplication startup main");
	        SpringApplication application = new SpringApplication(SmartEurekaApplication.class);
	        application.setBannerMode(Banner.Mode.OFF);
	        application.run(args);
	    }
}
