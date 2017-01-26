<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert_form.jsp</title>
</head>
<body>

<form action="insert.do" method="post">
    <div class="questionWrite">
		<div>
			<label for="writerMainquestion">제목:</label>
			<input type="text" name="writerMainquestion" id="writerMainquestion"/>
			<label for="writerDetailquestion">질문내용:</label>
			<textarea name="writerDetailquestion" id="writerDetailquestion" cols="20" rows="5"></textarea>
			<label for="writerWriter">작성자</label>
			<input type="text" id="writerWriter" name="writerWriter"/>
		</div>
		<button type="submit">작성</button>
	</div> 
</form> 
    
</body>
</html>