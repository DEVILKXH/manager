package com.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.base.mapper.BaseMapper;
import com.manager.inner.dto.Page;

public interface UserMapper extends BaseMapper<UserExample, User>{
    public List<User> getUserPage(@Param("user") User user, @Param("page") Page<User> page);
    public List<User> getUserList(@Param("user") User user);
    public int count(@Param("user") User user);
}