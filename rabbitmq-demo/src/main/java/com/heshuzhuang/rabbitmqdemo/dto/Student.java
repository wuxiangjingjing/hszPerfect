package com.heshuzhuang.rabbitmqdemo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author heshuzhuang
 * @Date 2019/11/26 10:44
 */
@Data
public class Student implements Serializable {

	private Integer age;

	private Integer Height;

	private String sex;

	private List<Student> studentList;
}
