<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DM 리스트</title>
		<link rel="stylesheet" type="text/css" href="../resources/css/list.css">
	</head>
	<body>
<div class="mainContainer">
	<aside class="dmContainer">
		<div class="container">
			<div id="contentSearch">
			<input type="search" name="dmsearch" placeholder="대화내용, 작성자 검색">
			<span id= "buttonBox">
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
		<div id="selectBtn">
		<select name="dayorder">
			<option value="latestCv">최신대화순</option>
			<option value="oldCv">오래된대화순</option>
		</select>
		<div id= "dayTag">
		<select name="day">
			<option value="sendMessage">보낸메시지</option>
			<option value="clearMessage">안읽은메시지</option>
		</select>
		</div>
		</div>
		
		<table>
			<tr id="dmTag1">
				<td><input type="checkbox" checked></td>
				<td><img src="" alt=""></td>
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
	
	<main>
		<article class="dmChang">
			<div id = naljja > <!-- 여기에다가 달러{0000년00월00일 } 넣기.  --> 
				<span id= "sysdateTag">0000년00월00일</span>
			</div>
			<div class="myMessageBox">
				<ul>
					<li>현재시간 메시지내용</li>
				</ul>
			</div>
			
			<div class="yourMessageBox">
				<ul>
					<li>현재시간 메시지내용</li>
				</ul>
			</div>
			
			<div id="fileUplode">
				<button>파일업로드</button>
			</div>
			<div id= "inputmessage">
				<input type="text" id="message" placeholder="메시지를 입력하세요" >
				<button type="submit" id="sendBtn">전송</button>
			</div>
		</article>
	</main>
</div>
		

</html>