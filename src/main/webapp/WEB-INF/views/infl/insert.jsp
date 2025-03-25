<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>크리에이터 가입</title>
  	<link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/signup.css">
</head>
	<body>
		<header>
        	<jsp:include page="/WEB-INF/views/include/header.jsp" />
    	</header>
		  <div class="container">
		    <div class="header">
		      <h2>크리에이터 가입</h2>
		      <div class="agreements">
		        <label><input type="checkbox"> 약관에 동의합니다. <a href="#">내용보기</a></label>
		        <label><input type="checkbox"> 개인정보 수집에 동의합니다. <a href="#">내용보기</a></label>
		      </div>
		    </div>
		    
		    <form action="/infl/insert" method="POST" class="form">
		      <div class="form-group">
		        <label for="id">아이디</label>
		        <input type="text" name="inflId" placeholder="아이디">
		        <button type="button">중복확인</button>
		      </div>
		
		     <!-- <div class="form-group">
		        <label for="business-number">생년월일</label>
		        <input type="number" name="birth" placeholder="yyyymmdd">
		      </div>
		        -->
		
		      <div class="form-group">
		        <label for="sex">성별</label>
		        <select name="inflGender" name="sex">
		          <option value="">선택하세요</option>
		          <option value="남자">남자</option>
		          <option value="여자">여자</option>
		        </select>
		      </div>
		
		     <!--  <div class="form-group">
		        <label for="plaform-name">대표 채널명</label>
		        <input type="text" name="inflplatform" placeholder="대표 채널명">
		      </div>-->
		
		      <div class="form-group">
		        <label for="platform">플랫폼</label>
		        <input type="text" name="inflPlatform">
		        <!--<select id="inflPlaformDetail" name="plaform">
		          <option value="">선택하세요</option>
		          <option value="youtube">유튜브</option>
		          <option value="instagram">인스타그램</option>
		          <option value="ticktock">틱톡</option>
		          <option value="blog">블로그</option>
		          <option value="fetc">그외(직접입력)</option>
		        </select> -->
		      </div>
		      <div class="form-group">
		      	<label for="url">사이트 주소</label>
		      	<input type="text" name="inflUrl">
		      </div>
		
		      <div class="form-group">
		        <label for="name">이름</label>
		        <input type="text" name="inflName" placeholder="이름">
		      </div>
		
		      <div class="form-group">
		        <label for="creator-name">크리에이터명</label>
		        <input type="text" name="inflNickname" placeholder="크리에이터명">
		      </div>
		
		      <div class="form-group">
		        <label for="password">비밀번호</label>
		        <input type="password" name="inflPw" placeholder="비밀번호">
		      </div>
		
		    <!--  <div class="form-group">
		        <label for="confirm-password">비밀번호 확인</label>
		        <input type="password" name="inflConfirmPw" placeholder="비밀번호 확인">
		      </div>
			-->
		      <div class="form-group">
		        <label for="email">이메일</label>
		        <input type="email" name="inflEmail" placeholder="이메일">
		        <button type="button">중복확인</button>
		      </div>
		
		      <div class="form-group">
		        <label for="address">주소</label>
		        <input type="text" name="inflAddress" placeholder="회사주소">
		        <button type="button">우편번호찾기</button>
		      </div>
		
		
		      <div class="form-group">
		        <label for="contact">연락처</label>
		        <input type="text" name="inflPhone" placeholder="연락처">
		      </div>
		
		      <button type="submit" value="가입" class="join-btn">Join</button>
		    </form>
		  </div>
	<footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
	</body>
</html>
