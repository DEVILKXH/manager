/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.util;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manager.entity.SysLoginLog;
import com.manager.entity.User;
import com.manager.service.SysLoginLogService;

@Component
public class UserUtil {

	@Autowired
	private SysLoginLogService sysLoginLogService;
	
	public void addLoginLog(HttpServletRequest request,HttpSession session,User user){
		SysLoginLog log = new SysLoginLog();
		log.setLogId(UUID.randomUUID().toString());
		log.setIp(request.getRemoteAddr());
		log.setUserId(user.getUserName());
		log.setUserName(user.getUserName());
		log.setSessionId(session.getId());
		log.setState("online");
		log.setLastestLoginTime(new Date());
		log.setCreateTime(new Date());
		sysLoginLogService.insertSelective(log);
	}
	
	public User getUser(HttpSession session){
		User user = (User) session.getAttribute("user");
		return user;
	}
	
	public void setUser(HttpSession session,User user){
		session.setAttribute("user", user);
	}
}
