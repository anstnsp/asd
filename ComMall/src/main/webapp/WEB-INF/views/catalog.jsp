<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
 .right{
 	float:right;
 }
</style>
<div class="navbar navbar-inverse">
	<a class="navbar-brand" href="${pageContext.request.contextPath}/home.do">Main</a>
	<a class="navbar-brand" href="${pageContext.request.contextPath}/product/list.do">컴퓨터</a>
	
	<div class="right">
	<c:choose>
		<c:when test="${empty id}">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/users/signin_form.do?type=view">로그인</a>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/users/signup_form.do?type=view">회원가입</a>
		</c:when>
		<c:otherwise>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/users/logout.do">로그아웃</a>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/users/private/update_form.do?type=data">정보수정</a>
		</c:otherwise>
	</c:choose>   
	</div>
</div>