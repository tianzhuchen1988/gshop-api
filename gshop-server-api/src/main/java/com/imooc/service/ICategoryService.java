package com.imooc.service;

import com.imooc.dataobject.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {

    Page<Category> findCategoryByCategoryName(String categoryName, Pageable pageable);
}
