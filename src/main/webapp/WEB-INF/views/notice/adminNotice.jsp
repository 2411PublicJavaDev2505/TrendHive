<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <div class="write-btn-container">
            <c:if test="${sessionScope.companyId == 'admin'}">
		        <a href="/notice/insert" class="write-btn">글쓰기</a>
		    </c:if>
		    </div>
            <tbody>
            <%-- <c:forEach items="${nList }" var="book" varStatus="i">
				<tr>
					<td class="num">${nList.size() - i.index }</td>
					<td class="title"><a href ="/book/detail?noticeNo=${notice.noticeNo }">${notice.noticeTitle }</a></td>
					<td class="writer">${notice.noticeWriter }</td>
					<td class="date">${notice.insertDate}</td>
				</tr>					
			</c:forEach> --%>
                <c:forEach var="notice" items="${nList}" varStatus="i">
                    <tr>
                        <td>${i.count}</td>
                        <td><a href="/notice/detail?noticeNo=${notice.noticeNo}">${notice.noticeTitle}</a></td>
                        <td>${notice.noticeWriter}</td>
                        <td>${notice.insertDate}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>


        <div class="pagination-container">
			
		    <%-- <div class="pagination">
		        <c:if test="${startNavi ne 1}">
		            <a href="/notice/adminNotice?currentPage=${startNavi - 1}" class="prev">&lt;</a>
		        </c:if>
		        <c:forEach begin="${startNavi}" end="${endNavi}" var="p">
		            <c:choose>
		                <c:when test="${p eq currentPage}">
		                    <a href="/notice/adminNotice?currentPage=${p}" class="active">${p}</a>
		                </c:when>
		                <c:otherwise>
		                    <a href="/notice/adminNotice?currentPage=${p}">${p}</a>
		                </c:otherwise>
		            </c:choose>
		        </c:forEach>
		        <c:if test="${endNavi ne maxPage}">
		            <a href="/notice/adminNotice?currentPage=${endNavi + 1}" class="next">&gt;</a>
		        </c:if>
		    </div> --%>
		
			<div class="pagination">
				<c:if test="${startNavi ne 1 }">
					<a href="/notice/adminNotice?page=${startNavi - 1 }" class="prev">&lt;</a>
				</c:if>
				<c:forEach begin="${startNavi }" end="${endNavi }" var="p">
					<a href="/notice/adminNotice?page=${p }">${p }</a>
				</c:forEach>
				<c:if test="${endNavi ne maxPage }">
					<a href="/notice/adminNotice?page=${endNavi + 1 }" class="next">&gt;</a>
				</c:if>
			</div>
		</div>


    <div class="search-filter">
        <form action="/notice/search" method="get">
            <select class="filter-dropdown">
                <option value="all">항목 선택 </option>
                <option value="title">제목</option>
                <option value="writer">작성자</option>
                <option value="content">내용</option>
            </select>
            <input type="text" class="search-input" name="searchKeyword" placeholder="검색어 입력">
            <button type="submit" class="search-btn">검색하기</button>
        </form>
    </div>

    </main>
    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>
