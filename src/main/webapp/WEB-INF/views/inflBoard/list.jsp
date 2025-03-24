<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 페이지</title>
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/boarder.css">
</head>
<body>
    <header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>
    <div class="container">
            <h1 id="subject">다양한 크리에이터들을 만나보세요</h1>
        <div class="search-bar">
                <div class="search-filter">
                    <select class="filter-dropdown">
                        <option value="content">플랫폼명</option>
                        <option value="company">활동주제</option>
                    </select>
                    <input type="text" class="search-input" placeholder="검색어 입력">
                    <button class="search-btn">🔍</button>
                </div>
        </div>

            <div class="board-list">
                <c:forEach items="${nList }" var="inflBoard">
                    <div class="list">
                        <div class="img" onclick="location.href='/detail-page'">
                            <div class="product-img">${inflBoard.inflId }</div>
                            <div class="img-text">${inflBoard.inflId }</div>
                        </div>
                    </div>
                </c:forEach>
            </div>       
    </div>

        <div class="pagination">
            <c:if test="${startNavi ne 1 }">
				<a href="/inflboard/list?currentPage=${startNavi -1}" class="prev">&lt;</a>
			</c:if>
				<c:forEach begin="${startNavi }" end="${endNavi }" var="p" >
				<a href="/inflboard/list?currentPage=${p }">${p }</a>
				
				</c:forEach>	
			<c:if test="${endNavi ne maxPage}">
				<a href="/inflboard/list?currentPage=${endNavi +1 }" class="next">&gt;</a>
			</c:if>
        </div>
    </div>
    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>
