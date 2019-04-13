package com.imooc.service.impl;

import com.imooc.dataobject.Hello;
import com.imooc.repository.HelloRepository;
import com.imooc.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    private HelloRepository helloRepository;

    @Override
    public Hello findOne(Integer id) {
        return helloRepository.findOne(id);
    }

    @Override
    public synchronized void syncTest() {
        syncTest2();
    }

    @Override
    public void bTest() {
        Hello hello = helloRepository.findOne(1);
        hello.setAge(hello.getAge() + 1);
        helloRepository.save(hello);
    }

    @Transactional
    public void syncTest2(){
        bTest();
    }
}
