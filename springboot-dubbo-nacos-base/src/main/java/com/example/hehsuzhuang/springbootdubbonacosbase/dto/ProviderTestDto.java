package com.example.hehsuzhuang.springbootdubbonacosbase.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author heshuzhuang
 * @Date 2020/3/3 18:01
 */
@Data
public class ProviderTestDto  implements Serializable {
	private int id;
	// 名字
	private String name;
	// 序号
	private Integer number;

}
