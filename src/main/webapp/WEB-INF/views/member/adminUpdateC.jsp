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
    <link rel="stylesheet" href="../resources/css/adminUpdate.css">
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
            <h2>크리에이터 정보 수정</h2>
            <form class="info-form">
                <div class="form-group">
                    <label for="id">아이디</label>
                    <input type="text" name="inflId" placeholder="아이디">
                </div>

                <div class="form-group">
                    <label for="plaform-name">회사명</label>
                    <input type="text" name="inflplaform" placeholder="회사명">
                </div>

                <div class="form-group">
	                <label for="address">회사주소</label>
		                <input type="text" name="inflAddress" placeholder="회사주소">
		                <button type="button">우편번호찾기</button>
		        </div>
                
                <div class="form-group">
                    <label for="detailed-address">상세주소</label>
                    <input type="text" name="inflDetailAddress" placeholder="상세주소">
                </div>

                <div class="form-group">
                    <label for="contact">연락처</label>
                    <input type="text" name="inflPhone" placeholder="연락처">
                </div>

                <div class="form-buttons">
                    <button type="submit" class="update-btn">정보수정</button>
                    <button type="button" class="withdraw-btn">회원탈퇴</button>
                </div>
            </form>
        </section>
    </div>
    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>
