<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 게시글 등록</title>
</head>
<body>
<div id="contrainer">
	<main>
		<div>
			<form class="register-form" action ="/inflboard/add" method = "post"> 
				<div class="form-group">
					<label>활동주제</label>
					<input type = "text" name = "inflConcept">
				</div>
				<div class="form-group">
					<label>플랫폼명</label>
					<select name = "inflPlatform">
						<option value="instagram" selected>인스타</option>
						<option value="youtube">유튜브</option>
						<option value="blog">블로그</option>
					</select>
				</div>
				<div class="form-group">
					<label>개인채널</label>
					<input type = "text" placeholder="url을 입력하세요." name = "inflUrl">
				</div>
				<div class="form-group">
					<label>팔로워수</label>
					<input type = "text" name = "inflFollower">
				</div>
				<div class="form-group">
					<label>이메일</label>
					<input type = "text" name = "inflEmail">
				</div>
				<div class="form-group">
					<label>자기소개</label>
					<input type = "text" name = "inflIntro">
				</div>
				<button type = "submit" class = "register-button">저장</button> 
			</form>
		</div>
	</main>
</div>
</body>
</html>