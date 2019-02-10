package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "t_hello")
@Data
public class Hello {
    @Id
    private Integer id;

    private String name;

    private Integer age;
}
