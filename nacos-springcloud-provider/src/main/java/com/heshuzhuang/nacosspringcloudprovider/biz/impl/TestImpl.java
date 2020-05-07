package com.heshuzhuang.nacosspringcloudprovider.biz.impl;

import com.heshuzhuang.nacosspringcloudprovider.biz.Test;
import org.springframework.stereotype.Service;

/**
 * @author heshuzhuang
 * @Date 2020/5/6 18:37
 */
@Service
public class TestImpl implements Test {


	@Override
	public String sayHello() {
		return "我是你爸爸爸";
	}
}
