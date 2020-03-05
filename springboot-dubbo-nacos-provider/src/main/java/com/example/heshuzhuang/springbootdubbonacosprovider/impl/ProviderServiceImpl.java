package com.example.heshuzhuang.springbootdubbonacosprovider.impl;

import com.example.hehsuzhuang.springbootdubbonacosbase.dto.ProviderTestDto;
import com.example.hehsuzhuang.springbootdubbonacosbase.service.IProviderService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heshuzhuang
 * @Date 2020/3/5 10:03
 */
@Service
public class ProviderServiceImpl implements IProviderService {
	@Override
	public List<ProviderTestDto> queryList() {
		ProviderTestDto testDTO1 = new ProviderTestDto();
		testDTO1.setId(1);
		testDTO1.setName("学生");
		testDTO1.setNumber(100);
		ProviderTestDto testDTO2 = new ProviderTestDto();
		testDTO2.setId(2);
		testDTO2.setName("教师");
		testDTO2.setNumber(101);
		// 组装数据
		List<ProviderTestDto> list = new ArrayList<>();
		list.add(testDTO1);
		list.add(testDTO2);
		return list;

	}
}
