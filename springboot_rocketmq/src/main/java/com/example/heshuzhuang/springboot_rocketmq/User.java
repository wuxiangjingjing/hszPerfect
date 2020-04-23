package com.example.heshuzhuang.springboot_rocketmq;

import lombok.Data;

import java.io.Serializable;

/**
 * @author heshuzhuang
 * @Date 2020/4/17 17:26
 */
@Data
public class User implements Serializable {


	private Integer id;

	private String name;
}
