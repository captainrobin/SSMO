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
					请输入用户名：<input type="text" id="username"/>
				</p>
				
				<p>
					请输入密码：<input type="password" id="password"/>
				</p>
				<p>
					请再次输入密码：<input type="password" id="again_password"/><span id="warning_pwd_no" style="color: red;display: none;">输入的两次密码不一致！</span><span id="warning_pwd_yes" style="color:green;display:none;">密码通过！</span>
				</p>
				<p>
					请输入邮箱：<input type="text" id="email"/><span id="warning_email_no" style="color: red;display: none;">邮箱格式不正确！</span><span id="warning_email_yes" style="color:green;display:none;">邮箱通过！</span>
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

<script type="text/javascript">
	$('#again_password').blur(function(){
		console.log("离开了输入框");
		var password = $('#password').val();
		var again_password = $('#again_password').val();
		if(again_password != password){
			console.log("不一样");
			$('#warning_pwd_no').show();
			$('#warning_pwd_yes').hide();
			$('#register').attr("disabled",true);
		}else{
			console.log("一样");
			$('#warning_pwd_no').hide();
			$('#register').attr("disabled",false);
			$('#warning_pwd_yes').show();
		}
	});
	
	$('#email').blur(function(){
		var true_email = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		var email = $('#email').val();
		if(!true_email.test(email)){
			
		}
	});
	
	$('#register').click(function(){
		alert("注册成功！")
	});
</script>
</html>