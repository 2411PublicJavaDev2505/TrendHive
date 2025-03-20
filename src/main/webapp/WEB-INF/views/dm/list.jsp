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
		<div id="contentSearch">
			<input type="text" name="dmsearch" value="대화내용, 작성자 검색">
		</div>
		<div id ="button1">
			<button>filter</button>
		</div>
		<div id="button2">
			<button>delete</button>
			<button>block</button> 
		</div>
		<select name="dayorder">
			<option value="latestCv">최신대화순</option>
			<option value="oldCv">오래된대화순</option>
		</select>
		<select name="day">
			<option value="sendMessage">보낸메시지</option>
			<option value="clearMessage">안읽은메시지</option>
		</select>
		<input type="checkbox" checked>
		<ul>
			<li>기업명</li>
			<li>DM내용 일부 보이기</li>
		</ul>
		<table border="1"></table>
	<thead>
		<tr>
			<th></th>
		</tr>
	</thead>
	
	<tbody>
	</tbody>
	</body>
</html>