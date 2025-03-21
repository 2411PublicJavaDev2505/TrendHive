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
			<div class="contentSearch">
			<input type="search" name="dmsearch" placeholder="대화내용, 작성자 검색">
			<span id= "buttonBox">
				<button type = "submit" id="magnifierBtn">
					<img src="../resources/images/icons8-돋보기-30.png" alt="send">
				</button>
			</span>
		
		</div>
		<div class = "button-container">
			<span class="button-group">
				<div class="button1">
					<button>filter</button>
				</div>
				<div class="button2">
					<button>delete</button>
					<button>block</button> 
				</div>
			</span>
		</div>
		<div class="selectBtn">
			<select name="dayorder">
				<option value="latestCv">최신대화순</option>
				<option value="oldCv">오래된대화순</option>
			</select>
			<select name="day">
				<option value="sendMessage">보낸메시지</option>
				<option value="clearMessage">안읽은메시지</option>
			</select>
		</div>
		
		<table>
			<tr id="dmTag1">
				<td><input type="checkbox" checked></td>
				<td><img src="" alt=""></td>
				<td>
					<div>기업명</div>
					<div>DM내용 일부 보이기</div>
<!-- 					<ul> -->
<!-- 						<li>기업명</li> -->
<!-- 						<li>DM내용 일부 보이기</li> -->
<!-- 					</ul> -->
				</td>
				<td>연월일</td>		 
			</tr>
			<tr id="dmTag2">
				<td><input type="checkbox" checked></td>
				<td><img src=""></td>
				<td>
					<div>기업명</div>
					<div>DM내용 일부 보이기</div>
<!-- 					<ul> -->
<!-- 						<li>기업명</li> -->
<!-- 						<li>DM내용 일부 보이기</li> -->
<!-- 					</ul>  -->
				</td>
				<td>연월일</td>		 
			</tr>
			<tr id="dmTag3">
				<td><input type="checkbox" checked></td>
				<td><img src=""></td>
				<td>
					<div>기업명</div>
					<div>DM내용 일부 보이기</div>
<!-- 					<ul> -->
<!-- 						<li>기업명</li> -->
<!-- 						<li>DM내용 일부 보이기</li> -->
<!-- 					</ul>  -->
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
			
			<div class="wrap">
	           	<div class="chat ch1">
				<!--  	<ul>
							<li>현재시간 메시지내용</li>
						</ul>-->
					<div class="icon"><i class="fa-solid fa-user"></i></div>
	                <div class="textbox">안녕하세요. 겸둥이입니다. 제품 언제쯤 도착할까요?</div>
	            </div>
	
	            <div class="chat ch2">
	                <div class="icon"><i class="fa-solid fa-user"></i></div>
	                <div class="textbox">네 안녕하세요. 트렌드하이브입니다. 확인해보겠습니다. </div>
	            </div>
	
	            <div class="chat ch1">
	                <div class="icon"><i class="fa-solid fa-user"></i></div>
	                <div class="textbox">넵 확인 후 말씀 주세요!</div>
	            </div>

        	</div>
        	<div class="wrap-bottom">
				<div id="fileUplode">
					<button>파일업로드</button>
<!-- 					<input type="file" value="파일업로드"> -->
				</div>
				<div id= "inputmessage">
					<!-- <textarea id="message" placeholder="메시지를 입력하세요"></textarea> -->
					<textarea rows="1180px" cols="150px" id="message" placeholder="메시지를 입력하세요"></textarea> 
					<!-- <input type="text" id="message" placeholder="메시지를 입력하세요" > -->
					<button type="submit" id="sendBtn">전송</button>
				</div>
        	</div>
		</article>
	</main>
</div>
		

</html>