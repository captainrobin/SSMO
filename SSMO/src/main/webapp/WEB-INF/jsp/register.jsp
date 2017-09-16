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
					用户名：<input type="text" id="username"/>
				</p>
				<p>
					密码：<input type="text" id="password"/>
				</p>
				<p><input type="button" value="注册" id="register"/></p>
			</div>
		</div>
	</div>
</div>
</body>

<script type="text/javascript">
	$('#register').click(function(){
		alert("注册成功！")
	});
</script>
</html>