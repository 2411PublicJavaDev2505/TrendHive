<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메시지</title>
	</head>
	<body>
		<div id="dmContainer">
		<jsp:include page="/WEB-INF/views/include/header.jsp"/>
			<main>
				<div id="date">
					<input type="text" name="sysdate">
				</div>
				<div id="viewMessage">
					<input type="text" name="viewDm">
				</div>
				<div id="getMessage">
					받은메시지
				</div>
				<div id="inputMessage">
					<input type="text" name="inputDM">
					<span>
						<button class="send">전송</button>
					</span>					
				</div>
			</main>
		</div>
	</body>
</html>