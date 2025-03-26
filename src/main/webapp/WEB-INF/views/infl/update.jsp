<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>크리에이터 정보수정</title>
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
		      <h2>크리에이터 정보수정</h2>
		    </div>
			    
			<form class="form" action="/ifnl/update" method="POST">
				
				<div class="form-group">
        			<input type="text" name="ifnlId" value="${ifnl.ifnlId}" readonly>
	      		</div>
		      
			    <div class="form-group">
			        <label for="name">이름 변경</label>
			        <input type="text" name="inflName" value="${ifnl.ifnlName}" readonly>
			    </div>
		
		      	<div class="form-group">
		        	<label for="plaform-name">대표 채널명 변경</label>
		        	<input type="text" name="inflplaform" value="${ifnl.inflplaform}" required>
		      	</div>
		
		  <!--    <div class="form-group">
		        <label for="plaform">플랫폼</label>
		        <select id="inflPlaformDetail" name="plaform">
		          <option value="">선택하세요</option>
		          <option value="youtube">유튜브</option>
		          <option value="instagram">인스타그램</option>
		          <option value="ticktock">틱톡</option>
		          <option value="blog">블로그</option>
		          <option value="fetc">그외(직접입력)</option>
		        </select>
		      </div>
		-->
		
		      	<div class="form-group">
		        	<label for="creator-name">크리에이터명 변경</label>
		        	<input type="text" name="inflNickName" value="${ifnl.inflNickName}" required>
		      	</div>
		
		      	<div class="form-group">
		        	<label for="password">비밀번호 재설정</label>
		        	<input type="password" name="inflPw" value="${ifnl.inflPw}" required>
		     	 </div>
		
		      	<div class="form-group">
		        	<label for="confirm-password">비밀번호 확인</label>
		        	<input type="password" name="inflPwCheck" placeholder="비밀번호 확인" required>
		      	</div>
		
		      	<div class="form-group">
		       	 	<label for="email">이메일 변경</label>
		        	<input type="email" name="inflEmail" value="${ifnl.inflEmail}" required>
		        	<button type="button">중복확인</button>
		      	</div>
		
		      	<div class="form-group">
		        	<label for="address">주소 변경</label>
		        	<input type="text" name="inflAddress" value="${ifnl.inflAddress}" required>
		        	<button type="button">우편번호찾기</button>
		      	</div>
		
		      	<div class="form-group">
		        	<label for="contact">연락처 변경</label>
		        	<input type="text" name="inflPhone" value="${ifnl.inflPhone}" required>
		      	</div>
		
		      	<button type="submit" class="update-btn"><a href="/ifnl/update-success" class="btn">정보 수정</a></button>
          <button type="button" class="withdraw-btn" onclick="confirmDelete()">회원탈퇴</button>
		    	</form>
		  	</div>
	<footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
    <script>
        function confirmDelete() {
            if (confirm("정말로 회원탈퇴하시겠습니까?")) {
                window.location.href = "/ifnl/delete";
            }
        }
    </script>
	</body>
</html>
