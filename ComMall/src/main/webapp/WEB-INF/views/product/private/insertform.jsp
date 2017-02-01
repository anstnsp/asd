<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="/WEB-INF/views/resource.jsp"/>
<html>
<head>
<meta charset="UTF-8"/>
<!-- SmartEditor 관련 javascript 로딩 -->
<script src="${pageContext.request.contextPath }/
	SmartEditor/js/HuskyEZCreator.js"></script>
</head>
<body>

<jsp:include page="/WEB-INF/views/catalog.jsp"/>
<div class="container">

<h3>상품 등록</h3>
<form action="insert.do" method="post" enctype="multipart/form-data">
	<label for="writer">작성자:</label>
	<input type="text" id="writer" 
		value="${id }" disabled="disabled"/><br/>
	<label for="productName">상품명:</label>
	<input type="text" name="productName" id="productName"/><br/>
	<label for="brand">브랜드:</label>
	<input type="text" name="brand" id="brand" /><br/>
	<label for="price">가격:</label>
	<input type="text" name="price" id="price" /><br/>
	<th><label for="myFile">첨부파일</label></th>
         <td><input type="file" name="myFile" id="myFile"/></td>
	<textarea name="ir1" id="ir1" style="width:766px;height:412px;display:none"></textarea>
	<div>
		<input type="button" onclick="submitContents(this);" value="서버로 내용 전송" />
	</div>	
</form>
<script>
var oEditors = [];

//추가 글꼴 목록
//var aAdditionalFontSet = [["MS UI Gothic", "MS UI Gothic"], ["Comic Sans MS", "Comic Sans MS"],["TEST","TEST"]];

nhn.husky.EZCreator.createInIFrame({
	oAppRef: oEditors,
	elPlaceHolder: "ir1",
	sSkinURI: "${pageContext.request.contextPath}/SmartEditor/SmartEditor2Skin.html",	
	htParams : {
		bUseToolbar : true,				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
		bUseVerticalResizer : true,		// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
		bUseModeChanger : true,			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
		//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록
		fOnBeforeUnload : function(){
			//alert("완료!");
		}
	}, //boolean
	fOnAppLoad : function(){
		//예제 코드
		//oEditors.getById["ir1"].exec("PASTE_HTML", ["로딩이 완료된 후에 본문에 삽입되는 text입니다."]);
	},
	fCreator: "createSEditor2"
});
function submitContents(elClickedObj) {
	oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", []);	// 에디터의 내용이 textarea에 적용됩니다.
	
	// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById("ir1").value를 이용해서 처리하면 됩니다.
	
	try {
		elClickedObj.form.submit();
	} catch(e) {}
}
</script>

</div>
<jsp:include page="/WEB-INF/views/footer.jsp"/>
</body>
</html>
