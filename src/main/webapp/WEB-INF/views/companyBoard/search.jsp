<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기업회원 홍보 게시판 - 목록</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/boarder.css">
</head>
<body>
    <header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>
    <div class="container">
        <h1 id="subject">다양한 기업들을 만나보세요</h1>
        <div class="search-bar">
            <div class="search-filter">
            	<form action="/companyboard/search" method="get">
	                <select class="filter-dropdown"  name = "searchCondition">
	                    <option value="productName"<c:if test="${searchCondition eq 'productName' }">selected</c:if>>제품명</option>
	                    <option value="productInfo"<c:if test="${searchCondition eq 'productInfo' }"></c:if>>제품 상세</option>	                        
	                    <option value="brandName"<c:if test="${searchCondition eq 'brandName' }"></c:if>>브랜드명</option>	                        
	                </select>
	                <input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요">
	                <button  type = "submit" class="search-btn">🔍</button>
	                <button  type = "submit" class="search-btn"><a href="/companyboard/add">등록하기</button>
	            </form>
            </div>
        </div>
            <div class="board-list">
                <c:forEach items="${searchList }" var="companyBoard">
                    <div class="list">
                        <div class="img" onclick="location.href='/detail-page'">
                            <a href="/companyboard/detail?companyPRNo=${companyBoard.companyPRNo }">
	                            <div class="product-img">
	                            <img src="..${companyBoard.filePath }">${companyBoardVO.filePath }</div>
<!-- 	                            회원정보 연결되면 ${company.companyName}으로 바꿀것 -->
	                            <div class="img-text">${companyBoard.brandName }</div>
                            </a>
                        </div>
                    </div>
                </c:forEach>
            </div>                    

            <div class="pagination">
                <c:if test="${startNavi ne 1 }">
                    <a href="/companyboard/list?currentPage=${startNavi - 1 }" class="prev">&lt;</a>
                </c:if>
                <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
                    <a href="/companyboard/list?currentPage=${p }">${p }</a>
                </c:forEach>
                <c:if test="${endNavi ne maxPage }">
                    <a href="/companyboard/list?currentPage=${endNavi + 1 }" class="next">&gt;</a>
                </c:if>
            </div>
    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</html>