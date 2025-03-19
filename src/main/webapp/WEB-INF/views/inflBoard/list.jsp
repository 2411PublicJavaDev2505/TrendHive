<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 목록</title>
</head>
<body>
	<div id="container">
	<main>
			<div class = "search-container">
				<form class = "search-form" action = "/inflboard/search" method="get">
					<select class = "search-select" name = "searchCondition">
						<option value = "inflPlatfoam">플랫폼명</option>
						<option value = "inflConcept">활동주제</option>
					</select>
					<input type = "text" class="search-input" name="searchKeyword" placeholder="검색어 입력">
					<button type = "submit" class="search-button">검색</button>
				</form>
			</div>
			
			<section class="board-content">
			<table class="user-table">
				<thead>
					<tr>
						<th class = "inflId">크리에이터명</th>
						<th class = "inflName">크리에이터 img</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${nList }" var="inflBoard">
						<tr>
							<td class = "inflId">${inflBoard.inflId }</td>
							<td class = "inflName"><a href="/inflboard/detail?inflName=${inflBoard.inflPRNo }">${inflBoard.inflId }</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
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
		
				 <nav id="nav">
            <ul class = "topMenu">
                <li><a href="/inflboard/add">글쓰기</a></li>
            </ul>
         </nav>
         </main>
         </div>
</body>
</html>