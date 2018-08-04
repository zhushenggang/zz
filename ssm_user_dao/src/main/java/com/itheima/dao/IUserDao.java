package com.itheima.dao;

import com.itheima.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    @Insert("insert into users(username,password,telephone,state)values(#{username},#{password},#{telephone},#{state})")
    void save(Users users);
    @Select("select * from users where username=#{username}")
    Users findUsersByName(String username);
}
