<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>
<script type="text/javascript" src="${ctx }/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div>
	<div>
		<div>
			<div>
				<p>
					<span style="color:red">*</span>请输入用户名：<input type="text" id="username"/>
					<span id="warning_name_no" style="color: red;display: none;">用户名为空！</span><span id="warning_name_yes" style="color:green;display:none;">用户名通过！</span>
				</p>
				
				<p>
					<span style="color:red">*</span>请输入密码：<input type="password" id="password"/>
				</p>
				<p>
					<span style="color:red">*</span>请再次输入密码：<input type="password" id="again_password"/>
					<span id="warning_pwd_no" style="color: red;display: none;">输入的两次密码不一致！</span><span id="warning_pwd_yes" style="color:green;display:none;">密码通过！</span>
				</p>
				<p>
					<span style="color:red">*</span>请输入邮箱：<input type="text" id="email"/>
					<span id="warning_email_no" style="color: red;display: none;">邮箱格式不正确！</span><span id="warning_email_yes" style="color:green;display:none;">邮箱通过！</span>
				</p>
				<p>
					备注：<input type="text" id="remark"/>
				</p>
				<p><input type="button" value="注册" id="register" disabled="disabled"/></p>
			</div>
		</div>
	</div>
</div>
</body>

<script type="text/javascript" src="${ctx }/js/register.js"></script>
</html>