<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>主页</title>
<link rel="shortcut icon" href="${ctx }/img/favicon.ico"
	type="image/x-icon" />
<link type="text/css" rel="stylesheet" href="${ctx }/css/index.css"></link>
<script type="text/javascript" src="${ctx }/js/jquery-3.2.1.min.js"></script>
</head>

<body class="body_index">
	<div>
		<div class="window_login">
			<div class="window_login_padding">
				<div class="content_login">
					<div class="column">
						<div class="label">
							<label class="label_content">用户名：</label>
						</div>
						<div class="content">
							<input class="text_content" type="text" id="username" placeholder="手机/邮箱/账号"/>
						</div>
					</div>
					<div class="column">
						<div class="label">
							<label class="label_content">密码：</label>
						</div>
						<div class="content">
							<input class="text_content" type="password" id="password" placeholder="账号密码"/>
						</div>
					</div>
				</div>
				<div class="buttons">
					<input class="button" type="button" value="登录" id="login" />
				</div>
				<a href="${ctx }/user/toRegister.html" style="margin-right: 5%;">没有账号？点击注册</a>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	

	$('#login').click(function() {
		var username = $('#username').val();
		var password = $('#password').val();

		if (username.trim() == "" || password.trim() == "") {
			alert("请输入用户名与密码！")
			return;
		}

		$.ajax({
			url : "${ctx}/user/login.do",
			data : {
				"username" : username,
				"password" : password
			},
			type : "get",
			dataType : 'json',
			success : function(data) {
				console.log(data);
				var status = data.massage;
				if (status == 0) {
					alert("账号验证通过！正在为您跳转...");
					location.href="${ctx}/homepage/toHomepage.html";
					/* location.href="${ctx}/user/transfer.html"; */
				}
				if (status == 1) {
					alert("账号或密码为空！");
				}
				if (status == 2) {
					alert("账号不存在！");
				}
				if (status == 3) {
					alert("密码错误！");
				}

			}
		});

	});
</script>
</html>