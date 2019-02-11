package com.imooc.service;

import com.imooc.dataobject.User;

public interface IUserService {

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User findUserByUsername(String username);

}
