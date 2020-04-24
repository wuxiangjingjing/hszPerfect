package com.example.heshuzhuang.springbootdubbonacosprovider.impl;

import com.example.hehsuzhuang.springbootdubbonacosbase.service.ICeshi;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;


/**
 * @author heshuzhuang
 * @Date 2020/3/5 13:57
 */
@Slf4j
@Service(interfaceName = "test01" ,group = "test01")
public class CeshiImpl1 implements ICeshi {
	@Override
	public String ceshi() {
	log.info("走到了测试1");
		return "测试1";
	}
}
