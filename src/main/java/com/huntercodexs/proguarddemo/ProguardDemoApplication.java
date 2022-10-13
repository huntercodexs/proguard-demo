package com.huntercodexs.proguarddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProguardDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProguardDemoApplication.class, args);
	}

}
