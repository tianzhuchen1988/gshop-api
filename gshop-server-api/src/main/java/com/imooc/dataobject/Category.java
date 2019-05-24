package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "t_category")
@Data
@DynamicUpdate
public class Category {

    @Id
    private Integer id;

    private String categoryName;

    private Integer categoryStatus;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;
}
