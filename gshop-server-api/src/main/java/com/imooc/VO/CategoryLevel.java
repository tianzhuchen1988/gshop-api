package com.imooc.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryLevel implements Serializable{

    private String levelName;
    private Integer levelCode;

    public CategoryLevel(){}

    public CategoryLevel(String levelName, Integer levelCode) {
        this.levelName = levelName;
        this.levelCode = levelCode;
    }
}
