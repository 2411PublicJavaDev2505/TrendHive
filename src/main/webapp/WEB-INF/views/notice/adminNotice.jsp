<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TrendHive 게시판</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/noticeboard.css">
</head>
<body>
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    
    <main class="board-container">
        <h1>공지사항</h1>
        <table class="board-table">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>날짜</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="notice" items="${noticeList}" varStatus="status">
                    <tr>
                        <td>${status.count}</td>
                        <td><a href="/notice/detail/${notice.id}">${notice.title}</a></td>
                        <td>${notice.author}</td>
                        <td>${notice.date}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>


        <div class="pagination-container">

		    <div class="pagination">
		        <c:if test="${startNavi ne 1}">
		            <a href="/notice/list?currentPage=${startNavi - 1}" class="prev">&lt;</a>
		        </c:if>
		        <c:forEach begin="${startNavi}" end="${endNavi}" var="p">
		            <c:choose>
		                <c:when test="${p eq currentPage}">
		                    <a href="/notice/list?currentPage=${p}" class="active">${p}</a>
		                </c:when>
		                <c:otherwise>
		                    <a href="/notice/list?currentPage=${p}">${p}</a>
		                </c:otherwise>
		            </c:choose>
		        </c:forEach>
		        <c:if test="${endNavi ne maxPage}">
		            <a href="/notice/list?currentPage=${endNavi + 1}" class="next">&gt;</a>
		        </c:if>
		    </div>
		

		    <div class="write-btn-container">
		        <a href="/notice/write" class="write-btn">글쓰기</a>
		    </div>
		</div>


        <div class="search-filter">
            <select class="filter-dropdown">
                <option value="">항목 선택 </option>
                <option value="title">제목</option>
                <option value="author">작성자</option>
                <option value="date">날짜</option>
            </select>

            <input type="text" class="search-input" placeholder="검색어 입력">

            <button class="search-btn">검색하기</button>
        </div>

    </main>
    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>
