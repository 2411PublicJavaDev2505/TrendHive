<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TrendHive 로그인</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/password.css">
</head>
<body>
	<div id="modal" class="modal">
        <div class="modal-content">
            <span class="close-btn">&times;</span>
<!--             <h2>마케팅을 위한 파트너를 찾고 계신가요?</h2> -->
            <div class="modal-body">
                <div class="option creator">
                    <h3>성공</h3>
                    <p>메일 전송이 완료되었습니다.</p>
                    <a href="/" class="home-btn">확인</a>
                </div>
            </div>
        </div>
    </div>
    <header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>

    <main class="password-main">
        <div class="password-container">
            <div class="password-image">
                <img src="../resources/images/loginEnter.jpg" alt="비밀번호 재설정 이미지">
            </div>
            
            <div class="password-form">
                <h1>비밀번호 재설정</h1>
                <form class="password-form" action="/infl/password" method="post">
                    <div class="form-group">
                        <label >아이디</label>
                        <input type="text" name="inflId" placeholder="아이디">
                    </div>
                    <div class="form-group">
                        <label >이메일 *</label>
                        <input type="email" name="inflEmail" placeholder="이메일*">
                    </div>
                    <button type="submit" class="password-btn">비밀번호 재설정 링크 보내기</button>
                </form>
                <p class="info-text">* 이메일 작성은 필수입니다.</p>
            </div>
        </div>
    </main>

    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
    
    <!-- <script>
    const modal = document.getElementById("modal");
    const closeModalBtn = document.querySelector(".close-btn");

    window.onload = function () {
        modal.style.display = "flex";
    };


    closeModalBtn.onclick = function () {
        modal.style.display = "none";
    };


    window.onclick = function (event) {
        if (event.target === modal) {
            modal.style.display = "none";
        }
    };
    </script> -->
</body>
</html>