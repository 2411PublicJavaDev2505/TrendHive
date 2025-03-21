<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 수정</title>
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/header.css">
</head>
<body>
<h1>게시글 수정</h1>
	<main>
		<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>
		<fieldset>
			<legend>게시글 수정</legend>
			<form action="/inflboard/modify" method="post" enctype="multipart/form-data"><!-- 기본값 -->
				<input type="hidden" name="inflUrl" value="${inflBoard.inflUrl }">
				<input type="hidden" name="insertDate" value="${inflBoard.insertDate }">
				<input type="hidden" name="inflConcept" value="${inflBoard.inflConcept }">
				<input type="hidden" name="inflPlatform" value="${inflBoard.inflPlatform }">
				<input type="hidden" name="inflFollower" value="${inflBoard.inflFollower }">
				<input type="hidden" name="inflIntro" value="${inflBoard.inflIntro }">
				개인채널 : <input type="text" name="inflUrl" value="${inflBoard.inflUrl }"><br>
				활동주제 : <input type="text" name="inflConcept" value="${inflBoard.inflConcept }"><br>
				플랫폼명 : <input type="text" name="inflPlatform" value="${inflBoard.inflPlatform }"><br>
				팔로워수 : <input type="text" name="inflFollower" value="${inflBoard.inflFollower }"><br>
	<%-- 		크리에이티브명 : <span>${infl.inflNickname }</span><br> --%>
				자기소개 : <textarea rows="4" cols="50" name="inflIntro">${inflBoard.inflIntro }</textarea><br>
				첨부파일 : <span><a href="../..${inflBoard.inflFilepath }">${inflBoard.inflFilename }</a></span>
				<input type="file" name="reloadFile"><br>
				<button type="submit">수정</button>
			</form>
		</fieldset>
		<jsp:include page = "/WEB-INF/views/include/footer.jsp"></jsp:include>
    </main>
</body>
</html>