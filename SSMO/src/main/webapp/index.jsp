<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
  <title>主页</title>
  <script type="text/javascript" src="${ctx }/js/jquery-3.2.1.min.js"></script>
</head>

<body>
	<div>
		<div>
			<div>
				<p>
					用户名：<input type="text" id="username"/>
				</p>
				<p>
					密码：<input type="text" id="password"/>
				</p>
				<p><input type="button" value="登录" id="login"/></p>
				<a href="${ctx }/user/toRegister.html">没有账号？点击注册</a>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$('#login').click(function(){
		var username = $('#username').val();
		var password = $('#password').val();
		
		if(username.trim() == "" || password.trim() == ""){
			alert("请输入用户名与密码！")
			return;
		}
		
		$.ajax({
			url:"${ctx}/user/login.do",
			data:{
				"username": username,
				"password": password
			},
			type:"get",
			dataType : 'json',
			success:function(data){
				console.log(data);
				var status = data.massage;
				if(status == 0){
					alert("账号验证通过！正在为您跳转...");
				}
				if(status == 1){
					alert("账号或密码为空！");
				}
				if(status == 2){
					alert("账号不存在！");
				}
				if(status == 3){
					alert("密码错误！");
				}
				
			}
		});
		
	});
</script>
</html>