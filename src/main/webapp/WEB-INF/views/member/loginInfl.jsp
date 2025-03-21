<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TrendHive 로그인</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/login.css">
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
                <h1>크리에이터 로그인</h1>
                <form class="login-form" action="/member/loginInfl" method="post">
                    <div class="form-group">
                        <label for=>아이디: </label>
                        <input type="text" name="memberId" placeholder="아이디">
                    </div>
                    <div class="form-group">
                        <label for=>비밀번호: </label>
                        <input type="password" name="memberPw" placeholder="비밀번호">
                    </div>
                    <div class="checkbox-container">
                        <input type="checkbox" id="save-id">
                        <label for="save-id">아이디 저장</label><br/>
                    </div>
                    <button type="submit" class="btn loginbtn">크리에이터 로그인</button>
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