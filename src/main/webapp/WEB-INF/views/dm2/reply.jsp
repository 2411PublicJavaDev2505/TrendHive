<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>답장하기</title>
</head>
<body>
	<h3>답장 작성</h3>
    
    <c:if test="${empty param.dmNo}">
        <p style="color:red;">잘못된 접근입니다. <a href="dmList.do">목록으로</a></p>
    </c:if>

    <c:if test="${not empty param.dmNo}">
    
	    <form action="/dm/send" method="post">
	        <input type="hidden" name="dmNo" value="${dm.dmNo}" />
	        <div>
	            <label for="receiverId">받는 사람:</label>
	            <input type="text" id="receiverId" name="receiverId" value="${dm.sendId}" readonly />
	        </div>
	        <div>
	            <label for="dmContents">내용:</label>
	            <textarea id="dmContents" name="dmContents" required></textarea>
	        </div>
	        <button type="submit">전송</button>
	    </form>
    </c:if>
</body>
</html>