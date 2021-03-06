package com.imooc.web.controller;

import com.imooc.VO.CategoryLevel;
import com.imooc.VO.ResultVO;
import com.imooc.dataobject.Category;
import com.imooc.service.ICategoryService;
import com.imooc.util.ResultVOUtil;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("levelList")
    public ResultVO<List<CategoryLevel>> levelList(){
        CategoryLevel c1 = new CategoryLevel("父级", 0);
        CategoryLevel c2 = new CategoryLevel("子级", 1);
        List<CategoryLevel> result = new ArrayList<>();
        result.add(c1);
        result.add(c2);

        return ResultVOUtil.success(result);
    }

    @PostMapping("list")
    public ResultVO<List<Category>> categoryList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                                 @RequestParam(value = "size", defaultValue = "10") Integer size,
                                                 @RequestParam String categoryName){
        PageRequest pageRequest = new PageRequest(page - 1, size);
        Page<Category> categoryPage = iCategoryService.findCategoryByCategoryName(categoryName, pageRequest);

        return ResultVOUtil.success(categoryPage);
    }

}
