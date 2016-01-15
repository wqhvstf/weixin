<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--  <script type="text/javascript"
	src="<%=basePath%>static/js/jquery.min.js"></script>-->

<script type="text/javascript">
	
</script>
</head>
<body>
	<a id="play"
		href="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxe3dc8107a9355d3e&redirect_uri=http://wqhvstf.6655.la/weixin/login/authenticate&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect">开始玩游戏</a>
</body>
</html>