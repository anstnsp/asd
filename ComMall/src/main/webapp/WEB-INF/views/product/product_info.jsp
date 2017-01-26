<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/WEB-INF/views/resource.jsp"/>
<title>상품정보</title>
<style>
	.product_main{
		margin-bottom:50px;
		height:500px;
		border-bottom: 1px solid black; 
	}
	.imgBox{
		float:left;
		width:400px;
	}
	img{
		width:100%;
	}
	.contentBox{
		float:left;
		margin-left:10%;
		margin-top:30px;
	}
	.content{
		clear:both;
	}
	.glyphicon-triangle-top{
		position:relative;
		cursor:pointer;
		top:-5px;
		left:3px;
	}
	.glyphicon-triangle-bottom{
		position: relative;
		cursor:pointer;
		top:5px;
		left:-15px;	
	}
	.buyBtn{
		float:right;
	}
</style>
</head>
<body>
<header>
	<jsp:include page="/WEB-INF/views/catalog.jsp"/>
</header>
<div class="container">
	<div class="product_main">
		<hr/>
		<div class="productName"><strong style="font-size:20px;">상품명: (${dto.brand}) ${dto.productName }</strong></div>
		<hr/>
		<div class="imgBox">
			<img src="${pageContext.request.contextPath }/upload/${dto.saveFileName}"/>
		</div>
		<div class="contentBox">
			<div class="brand">브랜드 : ${dto.brand}</div></br>
			<div class="regdate">등록 일자 : ${dto.regdate}</div></br>
			<p>배송정보 : 무료배송 | 퀵서비스 | 직접수령 | VIP배송</p></br>
			<div class="count">
				<p>주문수량 :
					<input type="text" id="count" value="1" style="width:30px;"/>
					<span class="glyphicon glyphicon-triangle-top" id="countUp"></span>
					<span class="glyphicon glyphicon-triangle-bottom" id="countDown"></span>
				</p>
			</div>
			<div class="price"><strong>가 격 : ${dto.price}</strong></div>
			<hr/>
			<span>총 가격 : <span id="totalPrice">${dto.price}</span></span>
			<button class="btn btn-success buyBtn">구매하기</button>
		</div>
	</div>
	<div class="content">${dto.content}</div>
	<div class="evaluation"></div>
	<div class="qa"></div>
</div>
<footer>
		<jsp:include page="/WEB-INF/views/footer.jsp"/>
</footer>
</body>
</html>

<script>
$("#countUp").click(function(){
	var count = $("#count").val();
	count ++;
	$("#count").val(count);
	$("#totalPrice").text(count*${dto.price});
});
$("#countDown").click(function(){
	var count = $("#count").val();
	if(count == 1){
		return;
	}
	count --;
	$("#count").val(count);
	$("#totalPrice").text(count*${dto.price});
});

$(function(){
	$.ajax({
		url:"${pageContext.request.contextPath}/views/evaluation/list.do?num=${num}",
		method:"GET",
		success: function(data){
			$(".evaluation").after(data);
		}
	});
	
	$.ajax({	
		url:"${pageContext.request.contextPath}/views/product/qna_list.do?num=${num}",
		method:"GET",
		success: function(data){
			alert(data);
			$(".qa").after(data);
		}
	});
});

</script>