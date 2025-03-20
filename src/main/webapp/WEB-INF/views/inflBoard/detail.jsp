<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 상세페이지</title>
</head>
<body>
<div id="container">
		<main>
			<article class = "inflboard-detail">
				<div class = "inflboard-header">
				
				<!-- 크리에이터 이미지? 어떻게?? -->
				
					<h2 class = "inflboard-title">${inflpr.inflprNickname }</h2>
					<div class = "inflboard-info">
						<span>개인채널 : ${inflpr.inflprUrl } </span><br>
						<span>메일 : ${inflpr.inflprEmail }</span><br>
						<span>등록일자 : ${inflpr.insertDate }</span><br>
					</div>
					
					<div class = "inflboard-info">
						<span>활동주제 : ${inflpr.inflprUrl } </span><br>
						<span>플랫폼명 : ${inflpr.inflprEmail }</span><br>
						<span>팔로워수 : ${inflpr.inflprUrl } </span><br>
						<span>자기소개 : ${inflpr.inflprEmail }</span><br>
					</div>
					
				</div>
			</article>
			<div class = "button-group">
				<div class = "admin-button">
					<a href = "/inflboard/delete?inflId=${inflboard.inflId }" class="btn" onclick="modifylist">수정하기</a>
					<a href = "/inflboard/delete?inflId=${inflboard.inflId }"=${inflboard.inflId }" class="btn" onclick="deletelist">삭제하기</a>
					<a href = "/inflboard/list" class="btn">목록</a>
				</div>
			</div>
		</main>
	</div>
</body>
</html>