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
	   .qnaBox{
      display:none;

      height:100%;
   }
   .questionWrite{
   	  display:none;
   }
   .qnaContent{
      height: 50%;
   }
   .adminWrite{
      
   }
   .glyphicon-question-sign{
      font-size:25px;
      color:red;
   }
   .glyphicon-text-color{
      font-size:25px;
      color:#73FAFF;
   }
   .onefuck{
      float:right;
   }
   .testT{
      display:none;
   }
   .answerBtn{
   	  
   }
   .aContent{
   		display:none;
   }
   .deleteBtn{
   		margin-left:20px;
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
	<div class="qa">
		   <table class="table">
      <thead>
         <tr>
            <th style="font-size:30px"><strong>Q&A 무엇이든 물어보세요 </strong></th>
            <th><strong>작성자</strong></th>
            <th>등록일</th>
         </tr>
      </thead>
      <tbody>
         <c:forEach var="tmp" items="${list}">
         <tr class="qnaTitle warning">
            <td>${tmp.writerMainquestion }</td>
            <td>${tmp.writerWriter }</td>
            <td>${tmp.regdate }</td>
         </tr>
         <tr class="qnaBox">
            <td colspan="3">
               <div class="qnaContent"><span class="glyphicon glyphicon-question-sign "></span><span>:</span>${tmp.writerDetailquestion}</div>
               <div style="margin-top:20px;border:1px solid grey;"></div>
               <div class="adminWrite">
                  <form action="a_insert.do?writerNum=${tmp.writerNum}&productNum=${dto.productNum}" method="post">
                     <p style="margin-top:10px;font-size:18px">
                     	<strong>답변</strong>
                     </p>  	
                    
                     <c:forEach var="tmp2" items="${list3}">  
                        <c:if test="${tmp.writerNum eq tmp2.answerRef_num}">
                        	
                           <p><span style="vertical-align:middle; width:85%; display:inline-block;">${tmp2.answerContent}</span>
                          	 <c:if test="${id eq 'admin'}">
                          		  <button  type="button" class="btn btn-default answerBtn1  deleteBtn" >수정</button>
                  		      	  <button class="btn btn-default deleteBtn" type="button" onclick="location.href='adelete.do?num=${tmp2.answerRef_num}&productNum=${productNum}'">삭제</button>
                 			 </c:if>
                            <div style="margin-top:20px;border:1px dotted grey;"></div>
                           	<div class="answerBtn">
                           		<input type="hidden" value="${tmp2.answerRef_num }" />
                			   	
                   		        <c:set var="num3" value="${tmp2.answerRef_num}"/>   
               			    	<c:set var="con3" value="${tmp2.answerContent}"/>           
              			    </div>        
                           </p>
                        </c:if>
                     </c:forEach>    
                                      
                     <!-- <p>${tmp3}</p> for문안에 있는 값을 밖으로 빼올 수 있다. -->
                        <c:choose>
                           <c:when test="${num3 ne tmp.writerNum}">
                         	  <div class="form-group">
                              <textarea class="form-control" name="answerContent" id="" cols="100" rows="5" value="" style="width:85%; display:inline-block; resize:none; vertical-align:middle;"></textarea>
                              <c:choose>
                                 <c:when test="${id ne 'admin'}">
                                    <button class="btn btn-default" id="qnaBtn" type="submit" disabled="disabled" style="margin-left:5%;">등록하기</button>
                                 </c:when>
                                 <c:otherwise>
                                    <button class="btn btn-default" id="qnaBtn" type="submit" style="margin-left:5%; ">등록하기</button>
                                 </c:otherwise>
                              </c:choose>
                              </div>
                           </c:when>
                           <c:otherwise>
                              <div>
                                 <div class="form-group aContent">
                                	 <textarea class="testT form-control" name="answerContent" cols="100" rows="5" value="" style="width:85%; display:inline-block; resize:none; vertical-align:middle;">${con3}</textarea>
                                	 <input type="hidden" value="${num3}" />
                       		          <c:if test="${id eq 'admin'}">
                                 		<button class="qaUpdateBtn btn btn-info" type="button" style="margin-left:5%; ">수정확인</button>
                               		  </c:if>
                                 </div>
                                 
                              </div>
                         </c:otherwise>
                      </c:choose>


                  </form>
               </div>
            </td>
         </tr>
         </c:forEach>
      </tbody>
   </table>
   
   <button type="submit" class="btn btn-info questionBtn" style="float:right">글쓰기</button>
   
   <form action="qna_insert.do" method="post">
        <div class="questionWrite">	
			<div class="form-group">
				<input type="hidden" name="writerNum" value="${dto.productNum}"/>
				<label class="control-label" for="writerMainquestion">제목:</label>
				<input class="form-control" type="text" name="writerMainquestion" id="writerMainquestion"/>
			</div>
			<div class="form-group">
				<label class="control-label" for="writerDetailquestion">질문내용:</label>
				<textarea class="form-control" name="writerDetailquestion" id="writerDetailquestion" cols="20" rows="5"></textarea>
			</div>
			<button class="btn btn-default" type="submit">작성</button>
		</div> 
   </form>  
   <br/>
   <br/>
   
<div class="page_display">
<center>

   <ul class="pagination">
   
   <c:choose>
      <c:when test="${startPageNum ne 1 }">
         <li><a href="${pageContext.request.contextPath }/views/product/qna_list.do?pageNum=${startPageNum-1 }">&laquo;</a></li>
      </c:when>
      <c:otherwise>
         <li class="disabled"><a class="muted" href="javascript:">&laquo;</a></li>
      </c:otherwise>
   </c:choose>
   
   <c:forEach var="i" begin="${startPageNum }" end="${endPageNum }">
      <c:choose>
         <c:when test="${i eq pageNum }">
            <li class="active"><a href="${pageContext.request.contextPath }/views/product/qna_list.do?pageNum=${i }">${i }</a></li>   
         </c:when>
         <c:otherwise>
            <li><a href="${pageContext.request.contextPath }/views/product/qna_list.do?pageNum=${i }&&list_num=${listNum}">${i }</a></li>
         </c:otherwise>
      </c:choose>    
   </c:forEach>
   <c:choose>
      <c:when test="${endPageNum lt totalPageCount }">
         <li><a href="${pageContext.request.contextPath }/views/product/qna_list.do?pageNum=${endPageNum+1 }&&list_num=${listNum}">&raquo;</a></li>
      </c:when>
      <c:otherwise>
         <li class="disabled"><a class="muted" href="javascript:">&raquo;</a></li>
      </c:otherwise>
   </c:choose>
   </ul>
</div>
</center>
	</div>
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
</script>

<script>
   $(".qnaTitle").on("click",function(){
      $(this).next("tr.qnaBox").toggle();
   });
   
   $(".questionBtn").on("click", function(){
	  $(".questionWrite").toggle();
   });
   $(".answerBtn1").on("click",function(){
		$(this).parents().find(".aContent").toggle();
   });
   
   
   $(".answerBtn").on("click",function(){
	      $(this).next(".aContent").toggle()
	      
	   });
	   
	     $(".qaUpdateBtn").click(function() {
	        var content = $(this).parent().find("textarea").val();
	        var num = $(this).siblings("input").val();
	        location.href="aupdate.do?num="+num+"&content="+content+"&productNum=${productNum}";
	              
	     })
</script>