<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<jsp:include page="/WEB-INF/views/resource.jsp"/>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
img{
		width:20%;
	}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/views/catalog.jsp"/>
<div class="container">

<h1>장바구니</h1>
<table class="table table-hover">
	<thead>
		<tr>
		<th>상품번호</th>
		<th>상품명</th>
		<th>사진</th>
		<th>브랜드</th>
		<th>가격</th>
		<th>수량</th>
		<th>총 가격</th>
		<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="tmp" items="${list }">
		<tr height="30">
			<td>${tmp.productNum }</td>
			<td>${tmp.productName }</td>
			<td><img src="${pageContext.request.contextPath }/upload/${tmp.saveFileName}"/></td>
			
			<td>${tmp.brand }</td>
			<td>${tmp.price }</td>
			<td>${tmp.amount }</td>
			<td>${tmp.money }</td>
			<td><input type="button" value="삭제" /></td>
		</tr>
	</c:forEach>
		
	</tbody>
</table>
<button class="btn btn-success buyBtn">구매하기</button>
	<button class="btn btn-primary listBtn">상품목록이동</button>
</div>
<jsp:include page="/WEB-INF/views/footer.jsp"/>
</body>
</html>