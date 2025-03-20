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
                <form class="password-form" action="/member/#" method="post">
                    <div class="form-group">
                        <label >아이디</label>
                        <input type="text" name="memberId" placeholder="아이디">
                    </div>
                    <div class="form-group">
                        <label >이메일 *</label>
                        <input type="email" name="memberEmail" placeholder="이메일*">
                    </div>
                    <div class="form-group">
                        <label for="userType">사용자 유형</label>
                        <select id="userType" name="userType">
                            <option value="">선택하세요</option>
                            <option value="company">기업</option>
                            <option value="creator">크리에이터</option>
                        </select>
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
</body>
</html>