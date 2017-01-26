<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<jsp:include page="/WEB-INF/views/resource.jsp"/>
<html>
<style>
	.container{
		width:30%;
	}
</style>
<jsp:include page="/WEB-INF/views/catalog.jsp"/>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h3>로그인</h3>
	<form action="signin.do" method="post">
		<div class="form-group">
			<label class="control-label" for="id">아이디:</label>
			<input class="form-control" type="text" id="id" name="memberId"/>
		</div>
		<div class="form-group">
			<label class="control-label" for="pwd">비밀번호:</label>
			<input class="form-control" type="text" id="pwd" name="memberPwd"/>
		</div>
		<button class="btn btn-success" type="submit" id="submitBtn">로그인</button>
		<button class="btn btn-danger" type="button" onclick='location.href="${pageContext.request.contextPath}/home.do"'>취소</button>
	</form>
</div>
</body>
</html>