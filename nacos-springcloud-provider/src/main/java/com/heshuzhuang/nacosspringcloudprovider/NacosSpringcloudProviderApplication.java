package com.heshuzhuang.nacosspringcloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosSpringcloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosSpringcloudProviderApplication.class, args);
	}

}
