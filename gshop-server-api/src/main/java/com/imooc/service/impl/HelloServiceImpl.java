package com.imooc.service.impl;

import com.imooc.dataobject.Hello;
import com.imooc.repository.HelloRepository;
import com.imooc.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    private HelloRepository helloRepository;

    @Override
    public Hello findOne(Integer id) {
        return helloRepository.findOne(id);
    }
}
