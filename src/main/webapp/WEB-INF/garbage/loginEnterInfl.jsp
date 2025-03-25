<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TrendHive 로그인</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/loginEnter.css">
</head>
<body>
    <header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>

    <main class="login-main">
        <div class="login-container">
            <div class="login-image">
                <img src="../resources/images/loginEnter.jpg" alt="로그인 이미지">
            </div>
            
            <div class="login-form">
                <h1>로그인</h1>
                <form class="login-form" action="/member/loginEnterInfl" method="post">
                    <div class="form-group">
                        <button class="login-btn">크리에이터 로그인</button>
                    </div>
                </form>
                <p>계정이 없으신가요? 
                    <a href="#signup-creator">크리에이터 회원가입</a>
                </p>
                <p>비밀번호를 잊으셨나요? 
                    <a href="#reset-password">비밀번호 재설정</a>
                </p>
            </div>
        </div>
    </main>

    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>