package com.imooc.web.controller;

import com.imooc.VO.CategoryLevel;
import com.imooc.VO.ResultVO;
import com.imooc.util.ResultVOUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("levelList")
    public ResultVO<List<CategoryLevel>> levelList(){
        CategoryLevel c1 = new CategoryLevel("父级", 0);
        CategoryLevel c2 = new CategoryLevel("子级", 1);
        List<CategoryLevel> result = new ArrayList<>();
        result.add(c1);
        result.add(c2);

        return ResultVOUtil.success(result);
    }

}
