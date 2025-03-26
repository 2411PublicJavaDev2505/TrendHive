<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>정보수정 완료</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/success.css">
</head>
<body>
    <jsp:include page="/WEB-INF/views/include/header.jsp" />

    <main class="container">
        <div class="message">
            <h1>정보수정이 완료되었습니다.</h1>
            <p>변경된 정보가 성공적으로 저장되었습니다.</p>
            <a href="/company/update" class="btn">내정보 확인</a>
            <a href="/" class="btn btn-secondary">메인 페이지로 이동</a>
        </div>
    </main>

    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>
