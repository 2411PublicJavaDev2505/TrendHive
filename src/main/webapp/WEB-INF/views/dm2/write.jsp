<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>최초 DM 보내기</title>
	<link rel="stylesheet" href="../resources/css/footer.css">
   	<link rel="stylesheet" href="../resources/css/header.css">
	<link rel="stylesheet" type="text/css" href="../resources/css/write.css">
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
    <div class="hDM">
		<h2>DM보내기</h2>
	</div>
	<div class="dm-outerContainer">
		<div class="dm-innerContainer">
		    <div class="sendBtn">
		        <button type="submit" id="sendBtn">전송</button>
		        <div id="fileUplode">
		        	<label for="file">파일업로드</label>
		            <input type="file" name="file" id="file"></br>
		        </div>
		    </div>
		    <div class="MessageBox">
		        <form action="dmSend.do" method="post" id="form" enctype="multipart/form-data">
				    <div class="sendler">
				        <label for="receiverId">받는 사람:</label>
				        <input type="text" id="receiverId" name="receiverId" placeholder="아이디를 입력하세요 (여러 명일 경우 콤마로 구분)" required><br>
				    </div>
				
				    <div class="wrap-bottom">
				
				        <div class="dmContents">
				            <label for="content"></label>
				            <textarea id="content" name="content" required></textarea><br>
							<div class="dmList">
							    <a href="dm2.list">목록</a>
							</div>
				        </div>
				
				    </div>
				</form>
			</div>	
		
		</div>
	</div>
</body>
</html>