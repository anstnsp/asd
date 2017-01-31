<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>후기 작성</title>
</head>
<body>
<h3>후기 작성</h3>
<form action="insert.do" method="post">
	<input type="hidden" name="writerNum" id="writerNum" />
	<input type="hidden" name="writerWriter" id="writerWriter"/>
	<label for="writerWriter">작성자</label>
	<input type="text" id="writerWriter" 
		value="${id }" disabled="disabled"/><br/>
	<label for="writerMainquestion">제목:</label>
	<input type="text" name="writerMainquestion" id="writerMainquestion"/><br/>
	<label for="writerDetailquestion">질문:</label>
	<textarea name="writerDetailquestion" id="writerDetailquestion" cols="30" rows="10"></textarea>
	<button type="submit">작성</button>
</form>
</body>
</html>