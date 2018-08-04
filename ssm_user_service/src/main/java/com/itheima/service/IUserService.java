package com.itheima.service;

import com.itheima.domain.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService  {

    void save(Users users);
}
