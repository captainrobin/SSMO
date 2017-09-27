<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>transfer</title>
<script type="text/javascript" src="${ctx }/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div>
	<div>
		<div>
			验证通过！正在跳转...
		</div>
	</div>
</div>
</body>

<script type="text/javascript">
setTimeout(function(){
	location.href="${ctx}/homepage/toHomepage.html";
},500);
</script>
</html>