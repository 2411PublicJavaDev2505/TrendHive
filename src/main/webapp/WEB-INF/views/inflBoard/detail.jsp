<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 상세페이지</title>
	<link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/inflBoardAdd.css">
</head>
<body>
<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>
<div id="container">
	<main>
		<div id="img-side">
            <div id="img-box">
            <!-- 이미지가 나오려면 9줄 다필요!!  -->
                <div class="list">	
                     <div class="img" onclick="location.href='/detail-page'">
                        <a href="/inflboard/detail?inflPRNo=${inflBoard.inflPRNo }">
                            <div class="product-img">
                            <img src="..${inflBoard.filePath }">${InflBoardVO.filePath }</div>
                            <div class="img-text">${inflBoard.inflId }</div>
                        </a>
                    </div>
                </div>
            <!-- 여기까지 써줘야 한다 -->
            </div>
        </div>

        <div id="intro-side">
            <div id="intro-box">

                <div id="name-box">
                	<%--${infl.inflNickname}--%>
                	<span id="infl-name" name="inflNickname">${inflBoard.inflId } </span>
                </div>
                
                <div id="inflConcept">
                	활동주제
                </div>
                <div id="inflConcept-detail">
                	<span id="inflConcept-name" name="inflConcept"><h2>${inflBoard.inflConcept } </h2></span>
                </div><br><br><br>
                
                <div id="inflPlatform">
                    플랫폼명
                </div>
                <div id="inflPlatform-detail">
                	<%--${infl.inflPlatform}--%>
                	<span id="inflPlatform-name" name = "inflPlatform"> ${inflBoard.inflPlatform }</span>
				</div>
                
                <div id="inflUrl">
                    개인채널
                </div>
                <div id="inflUrl-detail">
                	<span id="inflUrl-name" name="inflUrl" > ${inflBoard.inflUrl } </span>
                </div>
                
                <div id="follower">
                    팔로워수
                </div>
                <div id="follower-detail">
                	<span id="follower-name" name="inflFollower">${inflBoard.inflFollower } </span>
                </div>
            </div>
        </div>
        <div id="bottom-div">
            <div id="subject">
                <h1  id="product-detail">추가 소개</h1>
                <hr>
            </div>
            <div id="bottom-detail">
				<div id="d1">
                    등록일자
                </div>
                <div id="d2">
                	<span id="" name="insertDate"> ${inflBoard.insertDate }</span>
                </div>

                <div id="inflIntro">
                    자기 소개
                </div>
                <div id="inflIntro-detail">
                	<span id="real-product-detail" name="inflIntro" rows="10" cols="50" >${inflBoard.inflIntro }</span>
                </div>
	           		<button type = "submit" class="add-button">
						<a href = "/inflboard/add?inflPRNo=${inflBoard.inflPRNo }" 
						class="btn" onclick="modifylist">수정하기</a></button>
					<button type = "submit" class="add-button">
						<a href = "/inflboard/delete?inflPRNo=${inflBoard.inflPRNo }"=${inflBoard.inflPRNo }" 
						class="btn" onclick="deletelist">삭제하기</a></button>
					<button type = "submit" class="add-button">
						<a href = "/inflboard/list" class="btn">목록</a></button>
            	</div>         
        	</div>								
		</main>
		<jsp:include page = "/WEB-INF/views/include/footer.jsp"></jsp:include>

	</div>
</body>
</html>