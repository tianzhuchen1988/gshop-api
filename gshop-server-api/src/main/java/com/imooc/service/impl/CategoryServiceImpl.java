package com.imooc.service.impl;

import com.imooc.dataobject.Category;
import com.imooc.repository.CategoryRepository;
import com.imooc.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> findCategoryByCategoryName(String categoryName, Pageable pageable) {
        Page<Category> categoryPage = categoryRepository.findByCategoryName(categoryName, pageable);
        return new PageImpl<Category>(categoryPage.getContent(), pageable, categoryPage.getTotalElements());
    }
}
