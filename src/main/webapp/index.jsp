<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TrendHive</title>
    <link rel="stylesheet" href="../resources/css/main.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/modal.css">
</head>
<body>
    <div id="modal" class="modal">
        <div class="modal-content">
            <span class="close-btn">&times;</span>
            <h2>마케팅을 위한 파트너를 찾고 계신가요?</h2>
            <div class="modal-body">
                <div class="option company">
                    <h3>For Company</h3>
                    <p>제품을 등록하고 마케팅, 판매를 도와줄 인플루언서를 찾으세요.<br>즉시 회원가입으로 귀사의 효율성을 극대화 하세요!</p>
                    <a href="/company/insert" class="join-btn">기업 가입</a>
                </div>
                <div class="option creator">
                    <h3>For Creator</h3>
                    <p>마케팅, 판매 수주를 통해 새로운 기회를 창출하세요.<br>지금 가입하고 경쟁력을 강화하세요!</p>
                    <a href="/infl/insert" class="join-btn">크리에이터 가입</a>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
	<main class="main-container">
		
	        <div class="image-container">
	        	<a href="/companyboard/list">
	            <h2>For Company</h2>
	            <img src="../resources/images/maincompany031203.jpg" alt="Company Image">
	            </a>
	        </div>

	        <div class="image-container">
	            <a href="/inflboard/list">
	            <h2>For Creator</h2>
	            <img src="../resources/images/maincreater031204.jpg" alt="Creator Image">
		        </a>
	        </div>
    </main>
    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    <script>
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
    </script> <!-- 모달 동작 추가 -->
</body>
</html>