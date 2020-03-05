package com.example.heshuzhuang.springbootdubbonacosconsumer.controller;

import com.example.hehsuzhuang.springbootdubbonacosbase.dto.ProviderTestDto;
import com.example.hehsuzhuang.springbootdubbonacosbase.dto.ResultVO;
import com.example.hehsuzhuang.springbootdubbonacosbase.service.IProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author heshuzhuang
 * @Date 2020/3/5 10:09
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {


	@Reference
	private IProviderService providerService;
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ResultVO getList(){
		// 远程调用
		List<ProviderTestDto> providerTestDTOList = providerService.queryList();
		return new ResultVO.Builder<>().code(200).message("success").data(providerTestDTOList).build();
	}



}
