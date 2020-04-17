package com.heshuzhuang.nacos.demo;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * nacos   小demo 仅仅是测试读取配置文件
 */
@SpringBootApplication
@NacosPropertySource(dataId = "hsz.test", autoRefreshed = true)
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


    //   复制初始化为1   service.name
	@NacosValue(value = "${service.name:1}", autoRefreshed = true)
	private String serverName;

	@RequestMapping(value = "/test", method = GET)
	@ResponseBody
	public String get() {
		return serverName;
	}
}
