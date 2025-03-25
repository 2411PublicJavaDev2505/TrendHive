<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메시지 상세페이지</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>dm확인</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="detail.css">
</head>
<body>
    <jsp:include page="/WEB-INF/views/include/header.jsp" />

    <div class="action-group">
        <span id="action">
            <button id="delete">삭제</button>
            <button id="reply" onclick="location.href='/dm/reply'">답장</button>
        </span>
    </div>

    <div class="dmInfo">
        <c:forEach items="${Info }" var="Info" varStatus="i">
            <span id="infoRow">
            <tr>
                <td class="table sendler">${Info.sendId}</td>
                <td class="table receiveMSG">${Info.receiveTime }</td>
            </tr>
            </span>
        </c:forEach>
    </div>

    <!-- <div class="wrap-bottom">
        <div id="fileUplode">
            <button>파일업로드</button>
<!-- 					<input type="file" value="파일업로드"> -->
        </div>    
    </div> -->

    <!-- 받은 DM 내용-->
    <div class="receiveContents">
        <c:forEach items="${rContent }" var="content" varStatus="i">
            ${content.dmContents} <!--생각해보니까 쪽지가 아니라 대화라서 대화내용을 불러와야하는데...?-->
        </c:forEach>
    </div>

</body>
</html>