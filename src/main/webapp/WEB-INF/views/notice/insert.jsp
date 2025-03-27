<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Insert title here</title>
		<link rel="stylesheet" href="../resources/css/header.css">
    	<link rel="stylesheet" href="../resources/css/footer.css">
</head>
<body>
<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<form action="/notice/insert" method="post" enctype="multipart/form-data">
			제목 : <input type="text" name="noticeTitle" size="50"> <br>
			내용 : <textarea rows="5" cols="60" name="noticeContent"></textarea> <br>
			<button type="submit">등록</button>
		</form>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>