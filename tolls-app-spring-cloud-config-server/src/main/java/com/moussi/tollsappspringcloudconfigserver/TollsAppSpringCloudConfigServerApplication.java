package com.moussi.tollsappspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TollsAppSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollsAppSpringCloudConfigServerApplication.class, args);
	}
}
