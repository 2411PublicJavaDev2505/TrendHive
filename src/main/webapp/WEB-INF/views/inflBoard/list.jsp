<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>크리에이터 게시판 페이지</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
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
            	<form action="/inflboard/search" method="get">
	                <select class="filter-dropdown"  name = "searchCondition">
	                    <option value="inflPlatform">플랫폼명</option>
	                    <option value="inflConcept"  selected>활동주제</option>	                        
	                </select>
	                <input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요">
	                <button  type = "submit" class="search-btn">🔍</button>
	                <button  type = "submit" class="search-btn"><a style='text-decoration:none;' href="/inflboard/add">등록하기</a></button>
	            </form>
            </div>
        </div>
            <div class="board-list">
                <c:forEach items="${nList }" var="inflBoard">
                    <div class="list">
                        <div class="img" onclick="location.href='/detail-page'">
                            <a style='text-decoration:none;' href="/inflboard/detail/${inflBoard.inflPRNo }">
	                            <div class="product-img">
	                            <img src="..${inflBoard.filePath }">${InflBoardVO.filePath }</div>
<!-- 	                            회원정보 연결되면 ${infl.inflNickname}으로 바꿀것 -->
	                            <div class="img-text"><h3>${inflBoard.inflConcept }</h3></div>
                            </a>
                        </div>
                    </div>
                </c:forEach>
            </div>       

        <div class="pagination">
            <c:if test="${startNavi ne 1 }">
				<a style='text-decoration:none;' href="/inflboard/list?page=${startNavi -1}" class="prev">&lt;</a>
			</c:if>
				<c:forEach begin="${startNavi }" end="${endNavi }" var="p" >
				<a style='text-decoration:none;' href="/inflboard/list?page=${p }">${p }</a>
				
				</c:forEach>	
			<c:if test="${endNavi ne maxPage}">
				<a style='text-decoration:none;' href="/inflboard/list?page=${endNavi +1 }" class="next">&gt;</a>
			</c:if>
        </div>
    </div>
    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>
