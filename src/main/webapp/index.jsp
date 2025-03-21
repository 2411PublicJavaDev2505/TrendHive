<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TrendHive</title>
    <link rel="stylesheet" href="../resources/css/main.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
</head>
<body>
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
	<main class="main-container">
        <div class="image-container">
            <h2>For Company</h2>
            <img src="../resources/images/maincompany031203.jpg" alt="Company Image">
        </div>
        <div class="image-container">
            <h2><a href="/inflboard/list">For Creator</h2>
            <img src="../resources/images/maincreater031204.jpg" alt="Creator Image">
        </div>
    </main>
    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>