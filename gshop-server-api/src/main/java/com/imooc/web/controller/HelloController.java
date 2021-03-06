package com.imooc.web.controller;

import com.imooc.VO.ResultVO;
import com.imooc.dataobject.Hello;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GshopServiceException;
import com.imooc.service.IHelloService;
import com.imooc.util.ResultVOUtil;
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
    public ResultVO<Hello> findOne(Integer id){
        if(id == null){
            throw new GshopServiceException(ResultEnum.PARAM_ERROR);
        }
        return ResultVOUtil.success(iHelloService.findOne(id));
    }

    @GetMapping("count")
    public Integer messageCount(){
        return 5;
    }

    @GetMapping("syncTest")
    public void syncTest(){
        for(int i = 0; i< 10000; i++){
            new Thread(){
                public void run(){
                    iHelloService.syncTest();
                }
            }.start();
        }

    }


}
