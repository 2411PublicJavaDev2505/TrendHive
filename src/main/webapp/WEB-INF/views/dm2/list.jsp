<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DM 리스트</title>
		<link rel="stylesheet" type="text/css" href="../resources/css/dm.css">
	</head>
	<body>
	<aside>
		<div class="container">
			<div id="contentSearch">
			<input type="search" name="dmsearch" placeholder="대화내용, 작성자 검색">
			<span id= "buttonBox">
				<button type = "submit" id="xBtn">
					<img src="../resources/images/icons8-x-박스-x-50.png" alt="send">	
				</button>
				<button type = "submit" id="magnifierBtn">
					<img src="../resources/images/icons8-돋보기-30.png" alt="send">
				</button>
			</span>
		
		</div>
		<div class = "button-group">
			<span class="button-group">
				<div id ="button1">
					<button>filter</button>
				</div>
				<div id="button2">
					<button>delete</button>
					<button>block</button> 
				</div>
			</span>
		</div>
		<div class="dayTag">
			<div id= "dayTag1">
				<select name="dayorder">
					<option value="latestCv">최신대화순</option>
					<option value="oldCv">오래된대화순</option>
				</select>
			</div>
			<div id= "dayTag2">
				<select name="day">
					<option value="sendMessage">보낸메시지</option>
					<option value="clearMessage">안읽은메시지</option>
				</select>
			</div>
		</div>
		<table>
			<tr id="dmTag1">
				<td><input type="checkbox" checked></td>
				<td><image=""></td>
				<td>
					<ul>
						<li>기업명</li>
						<li>DM내용 일부 보이기</li> 
				</td>
				<td>연월일</td>		 
			</tr>
			<tr id="dmTag2">
				<td><input type="checkbox" checked></td>
				<td><image=""></td>
				<td>
					<ul>
						<li>기업명</li>
						<li>DM내용 일부 보이기</li> 
				</td>
				<td>연월일</td>		 
			</tr>
			<tr id="dmTag3">
				<td><input type="checkbox" checked></td>
				<td><image=""></td>
				<td>
					<ul>
						<li>기업명</li>
						<li>DM내용 일부 보이기</li> 
				</td>
				<td>연월일</td>		 
			</tr>
		</table>
		</div>
	</aside>
		

</html>