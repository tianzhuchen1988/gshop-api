package com.imooc.repository;

import com.imooc.dto.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Integer> {
}
