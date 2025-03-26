<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>기업회원 정보수정</title>
  	<link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/acount.css">
</head>
<body>
	<header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>
  		<div class="container">
    	<div class="header">
      		<h2>기업회원 정보수정</h2>
    	</div>
    
	    <form class="form" action="/company/update" method="POST">
	      <!-- <div class="form-group">
	        <label for="id">아이디</label>
	        <input type="text" name="companyId" placeholder="아이디">
	      </div> -->
	
	      <div class="form-group">
	        <label for="business-number">사업자 번호 재설정</label>
	        <input type="text" name="companyTax" value="${company.companyTax }" placeholder="사업자 번호 - 제외">
	        <button type="button">조회하기</button>
	      </div>
	
	      <!-- <div class="form-group">
	        <label for="business-doc">사업자등록증 첨부</label>
	        <input type="text" name="companyTaxIdDoc" placeholder="사업자등록증 첨부">
	        <button type="button">첨부</button>
	      </div> -->
	
	      <div class="form-group">
	        <label for="company-name">회사명 변경</label>
	        <input type="text" name="companyName" value="${company.companyName }" placeholder="회사명">
	      </div>
	
	      <div class="form-group">
	        <label for="ceo-name">대표명 변경</label>
	        <input type="text" name="ceoName" value="${company.ceoName }" placeholder="대표명">
	      </div>
	
	      <div class="form-group">
	        <label for="password">비밀번호 재설정</label>
	        <input type="password" name="companyPw" value="${company.companyPassword }" placeholder="비밀번호 재설정">
	      </div>
	
	      <!-- <div class="form-group">
	        <label for="confirm-password">비밀번호 확인</label>
	        <input type="password" name="companyPwCheck" placeholder="비밀번호 확인">
	      </div> -->
	
	      <div class="form-group">
	        <label for="email">이메일</label>
	        <input type="email" name="companyEmail" value="${company.companyEmail }" placeholder="이메일">
	        <button type="button">중복확인</button>
	      </div>
	
	      <div class="form-group">
	        <label for="company-address">회사주소</label>
	        <input type="text" name="companyAddress" value="${company.companyAddress }"placeholder="회사주소">
	        <button type="button">우편번호찾기</button>
	      </div>
	
	      <div class="form-group">
	        <label for="contact">연락처</label>
	        <input type="text" name="companyPhone" value="${company.companyPhone }" placeholder="연락처">
	      </div>
	
	      <button type="submit" class="join-btn">변경하기</button>
          <button type="submit" class="withdraw-btn">회원탈퇴</button>
	    </form>
	  </div>
	<footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>
