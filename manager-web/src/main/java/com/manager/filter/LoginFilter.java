package com.manager.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.manager.entity.User;
import com.manager.inner.dto.AjaxResult;
import com.manager.utils.StringUtil;


public class LoginFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
//		if(null == user){
//			String url = request.getContextPath() + request.getServletPath();
//			if(StringUtil.isNotNull(request.getQueryString())){
//				url += ("?" + request.getQueryString());
//			}
//			session.setAttribute("url", url);
//			AjaxResult<String> ajax = new AjaxResult<String>();
//			ajax.setStatus("404");
//			ajax.setMessage("请先登录");
//			response.getWriter().print(JSON.toJSONString(ajax));
////			response.sendRedirect("/manager-web/login.do");
//		}else{
			chain.doFilter(request, response);
//		}
//		chain.doFilter(req, res);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
