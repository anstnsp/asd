<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.1.1.js"></script>
<style>
   .qnaBox{
      display:none;
      border:2px solid orange;
      height:100%;
   }
   .questionWrite{
   	  display:none;
   }
   
   .qnaContent{
      height: 50%;
   }
   .adminWrite{
      border-top:1px solid;
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
</style>
<body>
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
               <div class="qnaContent"><span class="glyphicon glyphicon-question-sign "></span>${tmp.writerDetailquestion}</div><br/>
               <div class="adminWrite">
                  <form action="a_insert.do?writerNum=${tmp.writerNum}&productNum=${productNum}" method="post">
                     <span class="glyphicon glyphicon-text-color"></span>
                     <c:forEach var="tmp2" items="${list2}">  
                     	
                        <c:if test="${tmp.writerNum eq tmp2.answerRef_num}">
                           <p>${tmp2.answerContent}
                           <c:if test="${id eq 'admin'}">
                                       <button type="button" onclick="location.href='adelete.do?num=${tmp2.answerRef_num}&productNum=${productNum}'">삭제</button>
                                    </c:if>
                                 <c:set var="num3" value="${tmp2.answerRef_num}"/>   
                    			 <c:set var="con3" value="${tmp2.answerContent}"/>                      
                           </p>
                        </c:if>
                     </c:forEach>   
                   
                     <!-- <p>${tmp3}</p> for문안에 있는 값을 밖으로 빼올 수 있다. -->
                        <c:choose>
                           <c:when test="${num3 ne tmp.writerNum}">
                              <textarea name="answerContent" id="" cols="100" rows="5" value=""></textarea>
                              <c:choose>
                                 <c:when test="${id ne 'admin'}">
                                    <button class="btn btn-default" id="qnaBtn" type="submit" disabled="disabled">등록</button>
                                 </c:when>
                                 <c:otherwise>
                                    <button class="btn btn-default" id="qnaBtn" type="submit">등록</button>
                                 </c:otherwise>
                              </c:choose>
                           </c:when>
                           <c:otherwise>
                              <div>
                                 <c:if test="${id eq 'admin'}">
                                    <button  type="button" class="btn btn-default answerBtn" >수정</button>
                                 </c:if>
                                 <textarea class="testT" name="answerContent" cols="100" rows="5" value="">${con3}</textarea>
                                 <input type="hidden" value="${num3}" />
                                 <c:if test="${id eq 'admin'}">
                                 	<button class="qaUpdateBtn" type="button">수정확인</button>
                                 </c:if>
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
				<input type="hidden" name="writerWriter" value="1234"/>
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
<script>
   $(".qnaTitle").on("click",function(){
      $(this).next("tr.qnaBox").toggle();
   });
   
   $(".questionBtn").on("click", function(){
	  $(".questionWrite").toggle();
   });
   
   $(".qnaBtn").click(function(){
      var isSend = confirm("등록할래?");
      if(isSend){
         location.href="product/q&a.jsp?num=${dto.num}&productNum=${productNum}";
      }
   });
   
   $(".answerBtn").on("click",function(){
	      $(this).next("textarea.testT").toggle();
	      
	   });
	   
	     $(".qaUpdateBtn").click(function() {
	        var content = $(this).parent().find("textarea").val();
	        var num = $(this).siblings("input").val();
	        location.href="aupdate.do?num="+num+"&content="+content+"&productNum=${productNum}";
	              
	     })
</script>
