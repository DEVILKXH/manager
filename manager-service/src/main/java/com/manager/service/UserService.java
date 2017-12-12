package com.manager.service;

import com.manager.entity.User;
import com.manager.entity.UserExample;
import java.util.List;

public interface UserService {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String uuid);

    int updateByExampleSelective(User record,UserExample example);

    int updateByExample(User record, UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}