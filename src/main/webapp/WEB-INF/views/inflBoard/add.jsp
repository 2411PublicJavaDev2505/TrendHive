<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 게시글 등록</title>
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/inflBoardAdd.css">
</head>
<body>
<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>
<div id="contrainer">
	<main>
	 <div id="img-side">
            <div id="img-box">
                <img src="">
            </div>
        </div>
        <div id="intro-side">
            <div id="intro-box">

                <div id="name-box">
                	<%--${infl.inflNickname}--%>
                    <input id="company-name" type="text" name="companyName" placeholder="크리에이터명 입력"> 
                </div>
                
                <div id="inflConcept">
                    <input id="inflConcept-name" type="text" name="inflConcept" placeholder="활동주제 입력">
                </div><br><br><br>
                
                <div id="inflPlatform">
                    플랫폼명
                </div>
                <div id="inflPlatform-detail">
                	<%--${infl.inflPlatform}--%>
	                <select id="inflPlatform-name" name = "inflPlatform">
						<option value="instagram" selected>인스타</option>
						<option value="youtube">유튜브</option>
						<option value="blog">블로그</option>
					</select>
				</div>
                
                <div id="inflUrl">
                    개인채널
                </div>
                <div id="inflUrl-detail">
                    <input type="text" id="inflUrl-name" name="inflUrl" placeholder=" url 입력">
                </div>
                
                <div id="follower">
                    팔로워수
                </div>
                <div id="follower-detail">
                	<%--<input text="${infl.inflFollower}"--%>
                    <input type="text" id="follower-name" name="inflFollower" placeholder="팔로워수 입력">
                </div>
            </div>
        </div>
        <div id="bottom-div">
                <div id="subject">
                    <h1 id="product-detail">추가 소개</h1>
                    <hr>
                </div>
                <div id="bottom-detail">

                    <div id="d1">
                        모집 공고
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyPosting" placeholder="모집 공고">
                    </div>

                    <div id="inflIntro">
                        자기 소개
                    </div>
                    <div id="inflIntro-detail">
                        <textarea id="real-product-detail" name="inflIntro" rows="20" cols="100" placeholder="자기소개 입력란"></textarea>
                    </div>
                   
                    <div id="d1">
                        이메일
                    </div>
                    <div id="d2">
                    <%--<input text="${infl.inflEmail}"--%>
                        <input type="text" id="" name="inflEmail" placeholder="이메일">
                    </div>
                </div>
        </div>
	</main>
<jsp:include page = "/WEB-INF/views/include/footer.jsp"></jsp:include>
</div>
</body>
</html>