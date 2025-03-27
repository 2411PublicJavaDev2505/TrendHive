<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>공지사항 - 수정</title>
	</head>
	<body>
		<h1>공지사항 수정</h1>
		<form action="/notice/update" method="post" enctype="multipart/form-data">
			<input type="hidden" name="noticeNo" value="${notice.noticeNo }">
			<input type="hidden" name="noticeWriter" value="${notice.noticeWriter }">
			작성자 : <span>${notice.noticeWriter }</span><br>
			제목 : <input type="text" name="noticeTitle" value="${notice.noticeTitle }" size="50"> <br>
			내용 : <textarea rows="5" cols="60" name="noticeContent">${notice.noticeContent }</textarea> <br>
			<button type="submit">수정</button>
		</form>
	</body>
</html>