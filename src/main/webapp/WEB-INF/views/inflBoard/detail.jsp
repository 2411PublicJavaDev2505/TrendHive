<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 상세페이지</title>
	<link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/semimain.css">
</head>
<body>
	<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>
		<div id="container">
			<main>
				<article class = "inflboard-detail">
					<div class = "inflboard-header">
					
					<!-- 크리에이터 이미지? 어떻게?? -->
					
						<div class = "inflboard-info">
							<span>개인채널 : ${inflBoard.inflUrl } </span><br>
	<%-- 						<span>메일 : ${inflBoard.inflEmail }</span><br> --%>
							<span>등록일자 : ${inflBoard.insertDate }</span><br>
						</div>
						
						<div class = "inflboard-info">
							<span>활동주제 : ${inflBoard.inflConcept } </span><br>
							<span>플랫폼명 : ${inflBoard.inflPlatform }</span><br>
							<span>팔로워수 : ${inflBoard.inflFollower } </span><br>
							<span>자기소개 : ${inflBoard.inflIntro }</span><br>
						</div>
						<tr>
							<th>첨부파일</th>
							<td>
								<a href="../..${inflBoard.filePath }" download>
									${inflBoard.fileName}
								</a>
							</td>
						</tr>
						
					</div>
				</article>
				<div class = "button-group">
					<div class = "admin-button">
						<a href = "/inflboard/detail?inflPRNo=${inflBoard.inflPRNo }" class="btn" onclick="modifylist">수정하기</a>
						<a href = "/inflboard/delete?inflPRNo=${inflBoard.inflPRNo }"=${inflBoard.inflPRNo }" class="btn" onclick="deletelist">삭제하기</a>
						<a href = "/inflboard/list" class="btn">목록</a>
					</div>
				</div>
			<jsp:include page = "/WEB-INF/views/include/footer.jsp"></jsp:include>
		</main>
	</div>
</body>
</html>