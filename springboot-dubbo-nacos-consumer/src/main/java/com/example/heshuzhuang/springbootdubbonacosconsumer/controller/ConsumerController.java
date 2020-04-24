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

	@Reference(group = "test01")
	private ICeshi ceshi1;

	@Reference(group = "test02")
	private ICeshi ceshi12;




	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ResultVO getList(){
		// 远程调用
		List<ProviderTestDto> providerTestDTOList = providerService.queryList();
		return new ResultVO.Builder<>().code(200).message("success").data(providerTestDTOList).build();
	}

	/**
	 * 不同情况的调用
	 * 对于同一个接口有不同的实现类的处理，相较于spring来说可以使用注解@Service("服务名称") 结合注解@qualifier("服务名称")
	 * 相较于dubbo,可以对于service 配置不同的group,无论是对于xml 或者是注解配置（此处是注解配置，亲测）
	 *
	 * @param i
	 * @return
	 */
	@RequestMapping(value = "/ceshi",method = RequestMethod.GET)
	public String getResult(Integer i) {
		ceshi12.ceshi();
		return ceshi1.ceshi();
	}



}
