<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>크리에이터 정보 수정</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/adminSearch.css">
</head>
<body>
	<header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>
	    <div class="container">
	        <section class="containerL">
	        <div class="search-bar">
	            <input type="text" placeholder="회원 검색">
	            <button class="search-btn">🔍</button>
	        </div>
	        <section class="chat-section">
	            
	        </section>
	        </section>
	
	        <section class="containerR">
	            <h2>회원 리스트</h2>
	            <form class="admin-form">
	                <div class="table-container">
	                    <table class="member-table">
	                        <thead>
	                            <tr>
	                                <th>회원 유형</th>
	                                <th>회원 아이디</th>
	                                <th>회원 이메일</th>
	                                <th>회원 전화번호</th>
	                            </tr>
	                        </thead>
	                        <tbody>
	                            <tr>
	                                <td><span class="type creator">크리에이터</span></td>
	                                <td>ghcjf1234</td>
	                                <td>ghcjf1234@naver.com</td>
	                                <td>010-1234-5678</td>
	                            </tr>
	                            <tr>
	                                <td><span class="type company">기업</span></td>
	                                <td>gustj1234</td>
	                                <td>gustj1234@naver.com</td>
	                                <td>010-1234-5678</td>
	                            </tr>
	                        </tbody>
	                    </table>
	                </div>
	            
	            </form>
	        </section>
	    </div>
    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>
