<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <title>DM 답장 보내기</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="send.css">
</head>
<body>
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
	<div class="sDM">
		<h1>DM 답장</h1>
	</div>
	<div class="sendler2">
		<form action="/dm2/send" method="post" enctype="multipart/form-data">
			<input type="hidden" name="dmNo" value="${dm.dmNo }">
			받는사람 : <span>${dm.receiveId }</span><br>
			<input type="hidden" name="receiveId" value="${dm.receiveId }"><br>
			제목 : <input type="text" name="dmSubject" placeholder="제목을 입력하세요"> <br>
			내용 : <textarea rows="5" cols="60" name="dmContentss" placeholder="내용을 입력하세요"></textarea> <br>
			첨부파일 :	<span><a href="..${dm.filePath }">${dm.fileName }</a></span> 
			<input type="file" name="dUploadFiles" onchange="readURL(this)"> <br>
			
			<button type="submit" onclick="document.getElementById('dmForm').submit();">전송</button>
			<form id="dmForm" action="receiveId" value="${dm.receiveId }"></form>
			<input type="text" name="dmSubject">
			<textarea name="dmContentss"></textarea>
			
			<button type="submit">수정</button>
		</form>
	<br>
	<div>
		<button type="button" onclick="location.href='/dm2/list';">목록으로</button>
	</div>
	</body>
</html>