package com.heshuzhuang.nacosspringcloudconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * 主要是测试feign 调用
 * @author heshuzhuang
 * @Date 2020/4/26 14:44
 */
@Deprecated
@FeignClient("service-provider")
public interface ProviderClient {

	/**
	 * 测试feign
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET,value = "/hello")
	String helloWorld();
}
