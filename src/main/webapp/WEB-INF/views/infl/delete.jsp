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
    <link rel="stylesheet" href="../resources/css/withdraw.css">
</head>
<body>
    <header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>

    <main class="withdraw-main">
        <div class="withdraw-container">
            <div class="withdraw-image">
                <img src="../resources/images/withdrawal.jpg" alt="회원탈퇴 이미지">
            </div>
            
            <div class="withdraw-form">
                <h1>회원 탈퇴</h1>
                <form class="withdraw-form" action="/infl/delete" method="post">
                    <div class="form-group">
                        <label >아이디</label>
                        <input type="text" name="inflId" placeholder="아이디">
                    </div>
                    <div class="form-group">
                        <label >이메일 *</label>
                        <input type="email" name="inflEmail" placeholder="이메일*">
                    </div>

                    <button type="button" class="withdraw-btn" onclick="confirmDelete()">회원탈퇴 코드 보내기</button>
                </form>
                <p class="info-text">* 이메일 작성은 필수입니다.</p>
            </div>
        </div>
    </main>

    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
    <script>
        function confirmDelete() {
            if (confirm("성공적으로 회원탈퇴 코드를 이메일로 발송하였습니다.")) {
                window.location.href = "/";
            }
        }
    </script>
</body>
</html>