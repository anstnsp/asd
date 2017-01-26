<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list.jsp</title>
</head>
<body>
	<c:forEach var="tmp" items="${list}">
			<div>
				<div>제목 ${tmp.regdate}</div>
				<div>세부내용 ${tmp.regdate}</div>
				<div>작성자 ${tmp.regdate}</div>
			</div>			
	</c:forEach>
</body>
</html>