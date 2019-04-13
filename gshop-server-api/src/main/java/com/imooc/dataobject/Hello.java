package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "t_test_sync")
@Data
public class Hello {
    @Id
    private Integer id;

    private Integer age;
}
