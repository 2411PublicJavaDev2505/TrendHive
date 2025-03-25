<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>메시지 작성</title>
	<link rel="stylesheet" href="../resources/css/footer.css">
   	<link rel="stylesheet" href="../resources/css/header.css">
	<link rel="stylesheet" type="text/css" href="../resources/css/dm2.css">
</head>
<body>
    <div class="hDM">
		<h2>DM보내기</h2>
	</div>
    <div class="sendler">
        <form action="dmSend.do" method="post">
            <label for="receiverId">받는 사람:</label>
            <input type="text" id="receiverId" name="receiverId" required><br>
        </form>
    </div>

    <div class="wrap-bottom">
        <div id="fileUplode">
            <button>파일업로드</button>
<!-- 					<input type="file" value="파일업로드"> -->
        </div>
    <div class="dmContents">
        <label for="content">내용:</label>
        <textarea id="content" name="content" required></textarea><br>
        
        <div id="sendBtn">
            <button type="submit">전송</button>
        </div>
    </div>    
    
    <div class="dmList">
        <a href="dmList.do">목록</a> <!-- 목록으로 -->
    </div>
</body>
</html>