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
	                    <option value="productName">제품명</option>
	                    <option value="productInfo">제품 상세</option>	                        
	                    <option value="brandName" selected>브랜드명</option>	                        
	                </select>
	                <input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요">
	                <button  type = "submit" class="search-btn">🔍</button>
	                <button  type = "submit" class="search-btn"><a style='text-decoration:none;' href="/companyboard/add">등록하기</a></button>
	            </form>
            </div>
        </div>
            <div class="board-list">
                <c:forEach items="${cpList }" var="companyBoard">
                    <div class="list">
                        <div class="img" onclick="location.href='/detail-page'">
                            <a style='text-decoration:none;' href="/companyboard/detail/${companyBoard.companyPRNo }">
	                            <div class="product-img">
	                            <img src="..${companyBoard.filePath }">${companyBoardVO.filePath }</div>
<!-- 	                            회원정보 연결되면 ${company.companyName}으로 바꿀것 -->
	                            <div class="img-text"><h3>${companyBoard.brandName }</h3></div>
                            </a>
                        </div>
                    </div>
                </c:forEach>
            </div>                    

            <div class="pagination">
<!--             @RequestParam(value="page"이부분과 쿼리문 맞춰줘야함 -->
                <c:if test="${startNavi ne 1 }">
                    <a style='text-decoration:none;' href="/companyboard/list?page=${startNavi - 1 }" class="prev">&lt;</a>
                </c:if>
                <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
                    <a style='text-decoration:none;' href="/companyboard/list?page=${p }">${p }</a>
                </c:forEach>
                <c:if test="${endNavi ne maxPage }">
                    <a style='text-decoration:none;' href="/companyboard/list?page=${endNavi + 1 }" class="next">&gt;</a>
                </c:if>
            </div>
    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</html>