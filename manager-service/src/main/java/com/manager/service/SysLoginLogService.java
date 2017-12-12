package com.manager.service;

import com.manager.entity.SysLoginLog;
import com.manager.entity.SysLoginLogExample;
import java.util.List;

public interface SysLoginLogService {
    int countByExample(SysLoginLogExample example);

    int deleteByExample(SysLoginLogExample example);

    int deleteByPrimaryKey(String logId);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    List<SysLoginLog> selectByExample(SysLoginLogExample example);

    SysLoginLog selectByPrimaryKey(String logId);

    int updateByExampleSelective(SysLoginLog record, SysLoginLogExample example);

    int updateByExample(SysLoginLog record, SysLoginLogExample example);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
}