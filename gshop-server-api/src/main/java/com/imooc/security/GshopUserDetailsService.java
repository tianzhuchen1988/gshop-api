package com.imooc.security;

import com.imooc.dataobject.User;
import com.imooc.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GshopUserDetailsService implements UserDetailsService{

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IUserService iUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = passwordEncoder.encode("123456");
        return new User(username, password);
        //return iUserService.findUserByUsername(username);
    }
}
