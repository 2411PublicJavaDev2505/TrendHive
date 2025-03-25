<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DM메시지함</title>
		<link rel="stylesheet" href="../resources/css/footer.css">
    	<link rel="stylesheet" href="../resources/css/header.css">
		<link rel="stylesheet" type="text/css" href="../resources/css/dm.css">
	</head>
	<body>
		<h1>받은 쪽지함</h1>
		<table border="1">
			<thead>
			<tr>
				<th>보낸사람</th>
				<th>내용</th>
				<th>날짜</th>
				<th>차단</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach var="dm" items="${dmList }">
				<tr>
					<td>${dm.sendId }</td>
					<td>${dm.dmContents }</td>
					<td>${dm.receiveId }</td>
					<td>${dm.block }</td>
				</tr>
				</c:forEach>	
			</tbody>
		</table>

		<div>
			<button type="button" onclick="showModifyForm(${board.boardNo});">수정하기</button>
			<button type="button" onclick="deleteConfirm(${board.boardNo})">삭제하기</button>
			<button type="button" id="listBtn">목록으로</button>
			<button type="button" onclick="goBack();">뒤로가기</button>
		</div>
		<script>
			function showModifyForm(boardNo) {
				location.href="/board/modify/"+boardNo;
			}
			function deleteConfirm(boardNo) {
				var result = confirm("정말로 삭제하시겠습니까?");
				if(result) {
					location.href="/board/delete/"+boardNo;
				}
			}
			document.querySelector("#listBtn")
				.addEventListener("click", function() {
				location.href = "/board/list";
			});
			function goBack() {
				history.go(-1);
			}
		</script>
		<a href="messageWrite.do">쪽지보내기</a>
	</body>