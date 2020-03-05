package com.example.heshuzhuang.springbootdubbonacosconsumer.controller;

import com.example.hehsuzhuang.springbootdubbonacosbase.dto.ProviderTestDto;
import com.example.hehsuzhuang.springbootdubbonacosbase.dto.ResultVO;
import com.example.hehsuzhuang.springbootdubbonacosbase.service.ICeshi;
import com.example.hehsuzhuang.springbootdubbonacosbase.service.IProviderService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ConsumerController {


	@Reference
	private IProviderService providerService;

	@Reference
	private ICeshi ceshi1;
//	@Reference
//	@Qualifier("ceshi2")
//	private ICeshi ceshi12;




	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ResultVO getList(){
		// 远程调用
		List<ProviderTestDto> providerTestDTOList = providerService.queryList();
		return new ResultVO.Builder<>().code(200).message("success").data(providerTestDTOList).build();
	}

	/**
	 * 不同情况的调用
	 * @param i
	 * @return
	 */
	@RequestMapping(value = "/ceshi",method = RequestMethod.GET)
	public String getResult(Integer i) {
		log.info("获取的i值是" +  i);
		// 远程调用
		return ceshi1.ceshi();
	}



}
