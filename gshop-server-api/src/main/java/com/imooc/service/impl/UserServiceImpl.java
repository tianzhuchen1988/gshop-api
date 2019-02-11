package com.imooc.service.impl;

import com.imooc.dataobject.User;
import com.imooc.repository.UserRepository;
import com.imooc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("用户不存在");
        }

        return user;
    }
}
