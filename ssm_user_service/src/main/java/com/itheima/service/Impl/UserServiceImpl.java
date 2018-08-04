package com.itheima.service.Impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.Users;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Node;
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    @Override
    public void save(Users users) {
        userDao.save(users);
    }



}
