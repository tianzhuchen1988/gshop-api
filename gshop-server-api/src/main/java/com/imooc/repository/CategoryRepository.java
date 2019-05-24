package com.imooc.repository;


import com.imooc.dataobject.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    Page<Category> findByCategoryName(String categoryName, Pageable pageable);
}
