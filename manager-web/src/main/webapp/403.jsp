<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8"
	language="java"%>
<html>
<head>
<title>403 ~ 页面不存在</title>
</head>
<style>
.error-box {
	text-align: left;
	display:inline-block;;
	width: 750px;
	height: 220px;
	background: url(images/404.jpg) 0 0;
	position: relative;
	top:50%;
	margin-top: -110px;
}

.error-box .txt {
	position: absolute;
	left: 236px;
	top: 16px;
	color: #fff;
	font-size: 12px;
	font-family: "microsoft yahei";
}

.error-box .m {
	position: absolute;
	left: 336px;
	top: 50px;
	line-height: 18px;
	font-size: 14px;
	font-family: "microsoft yahei";
	list-style: none;
}
.error-box .m li{
padding-bottom: 8px;
}
.norsTitle2 {
font-family: arial;
font-size: 13px;
color: #666;
font-weight: 900;
}
body{
padding: 0px;
margin: 0px;
}
</style>
<body>
<div style="width:100%;height:100%;text-align: center;vertical-align: middle;paddind:50%">
<div class="error-box">
		<span class="txt">很抱歉，您要访问的页面不存在</span>
		
		<ul class="m">
		<p class="norsTitle2">温馨提示：</p>
			<li>这个程序猿很懒什么都没有留下</li>
			<li>您可以退回到之前的页面，或者</li>
			<li><a href="<%=request.getContextPath() %>/index.do">返回个人中心</a></li>
		</ul>
		
	</div>
</div>

</body>
</html>