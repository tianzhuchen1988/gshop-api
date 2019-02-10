package com.imooc.web;

import com.imooc.dto.Hello;
import com.imooc.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IHelloService iHelloService;

    @GetMapping
    public Hello findOne(Integer id){
        return iHelloService.findOne(id);
    }

}
