package com.manager.listener;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.manager.entity.SysLoginLog;
import com.manager.inner.util.StringUtil;
import com.manager.service.SysLoginLogService;


@Component
public class SessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext());
//		applicationContext.getBean(arg0)
		SysLoginLogService sysLoginLogService = (SysLoginLogService) applicationContext.getBean("sysLoginLogService");
		String logId = (String) session.getAttribute("logId");
		if(StringUtil.isNotNull(logId)){
			SysLoginLog log = sysLoginLogService.selectByPrimaryKey(logId);
			log.setLastestLogoutTime(new Date());
			log.setState("outline");
			sysLoginLogService.updateByPrimaryKeySelective(log);
		}
	
	}

}
