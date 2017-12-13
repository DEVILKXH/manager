<%@ page pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	if(request.getAttribute("contextPath")==null){
		String contextPath = request.getContextPath();
		request.setAttribute("contextPath", contextPath);
		request.setAttribute("resources", contextPath+"/resources/");
	}
%>
