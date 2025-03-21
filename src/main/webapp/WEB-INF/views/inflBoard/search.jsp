<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 목록</title>
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/semimain.css">
</head>
<body>   	
	<main>
		<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>
		<h1 id="subject">다양한 크리에이터들을 만나보세요</h1>
		
		<div class = "search-div">
			<div class = "search" action = "/inflboard/search" method="get">
				<form action="/inflboard/search" method="get">
					<select class = "search-select" name = "searchCondition">
						<option value = "inflPlatfoam" <c:if test="${searchCondition eq 'inflPlatfoam' }">selected</c:if>>플랫폼명</option>
						<option value = "inflConcept"<c:if test="${searchCondition eq 'inflConcept' }"></c:if>>활동주제</option>
					</select>
						<input type = "text" class="search-input" name="searchKeyword" placeholder="검색어 입력">
						<button type = "submit" class="search-button"><a href="/inflboard/search">검색</button>
				</form>
					<button type = "submit" class="add-button"><a href="/inflboard/add">글쓰기</a></button>
			</div>
		</div>
		
		 <!-- <nav id="nav">
           <ul class = "topMenu">
                <li><a href="/inflboard/add">글쓰기</a></li>
            </ul>
         </nav> -->
		<hr>
			
			<section class="board-content">
				<div class="list-container">
					<c:forEach items="${searchList }" var="inflBoard">
						<div class="list">
							<div id="img">
								<a href="/inflboard/detail?inflPRNo=${inflBoard.inflPRNo }">
								<div id="image">${inflBoard.inflId }</div>
								<div id="img-text">${inflBoard.inflId }</div>
								</a>
							</div>
						</div>
					</c:forEach>
				</div>
			</section>
			<br>
				 
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
				 
       <jsp:include page = "/WEB-INF/views/include/footer.jsp"></jsp:include>
    </main>
  	
</body>
</html>