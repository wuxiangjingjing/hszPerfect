package com.heshuzhuang.rabbitmqdemo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private Integer role;

    private String address;

    private String email;

    private Date lastlogintime;

    private List<Student> studentList;

    private static final long serialVersionUID = 1L;

}