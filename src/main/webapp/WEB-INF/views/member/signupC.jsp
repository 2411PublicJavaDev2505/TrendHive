<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>기업회원 가입</title>
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
      		<h2>기업회원 가입</h2>
      		<div class="agreements">
        		<label><input type="checkbox"> 약관에 동의합니다. <a href="#">내용보기</a></label>
        		<label><input type="checkbox"> 개인정보 수집에 동의합니다. <a href="#">내용보기</a></label>
      	</div>
    	</div>
    
	    <form class="form" action="/company/insert" method="POST">
	      <div class="form-group">
	        <label for="id">아이디</label>
	        <input type="text" name="companyId" placeholder="아이디">
	        <button type="button">중복확인</button>
	      </div>
	
	      <div class="form-group">
	        <label for="business-number">사업자 번호 입력</label>
	        <input type="text" name="companyTax" placeholder="사업자 번호 - 제외">
	        <button type="button">조회하기</button>
	      </div>
	
	      <div class="form-group">
	        <label for="business-doc">사업자등록증 첨부</label>
	        <input type="file" name="uploadFile" placeholder="사업자등록증 첨부">
	      </div>
	
	      <div class="form-group">
	        <label for="company-name">회사명</label>
	        <input type="text" name="companyName" placeholder="회사명">
	      </div>
	
	      <div class="form-group">
	        <label for="ceo-name">대표명</label>
	        <input type="text" name="ceoName" placeholder="대표명">
	      </div>
	
	      <div class="form-group">
	        <label for="password">비밀번호</label>
	        <input type="password" name="companyPw" placeholder="비밀번호">
	      </div>
	
	      <div class="form-group">
	        <label for="confirm-password">비밀번호 확인</label>
	        <input type="password" name="companyPwCheck" placeholder="비밀번호 확인">
	      </div>
	
	      <div class="form-group">
	        <label for="email">이메일</label>
	        <input type="email" name="companyEmail" placeholder="이메일">
	        <button type="button">중복확인</button>
	      </div>
	
	      <div class="form-group">
	        <label for="company-address">회사주소</label>
	        <input type="text" name="companyAddress" placeholder="회사주소">
	        <button type="button">우편번호찾기</button>
	      </div>
	
	      <div class="form-group">
	        <label for="detailed-address">상세주소</label>
	        <input type="text" name="companyDetailAddress" placeholder="상세주소">
	      </div>
	
	      <div class="form-group">
	        <label for="contact">연락처</label>
	        <input type="text" name="companyPhone" placeholder="연락처">
	      </div>
	
	      <button type="submit" class="join-btn">Join</button>
	    </form>
	  </div>
	<footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>
