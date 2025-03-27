<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인플루언서 홍보 게시판 - 수정</title>
    <link rel="stylesheet" href="../../resources/css/footer.css">
    <link rel="stylesheet" href="../../resources/css/header.css">
    <link rel="stylesheet" href="../../resources/css/inflBoardAdd.css">
</head>
<body>
<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>

	<main>
		<form action ="/inflboard/modify" method="post" enctype="multipart/form-data">
		<input type="hidden" name="inflPRNo" value="${inflBoard.inflPRNo }">
		<div id="img-side">
            <div id="img-box">
			    <img id="preview" src="../..${inflBoard.filePath }">
                첨부파일 : <span><a href="..${inflBoard.filePath }">${inflBoard.fileName }</a></span>
				<input type="file" name="reloadFile" onchange="readURL(this)">
            </div>
        </div>
        <div id="intro-side">
            <div id="intro-box">

                <div id="name-box">
                	<%--${infl.inflNickname}--%>
                    <input id="company-name" type="text" name="inflNickname" value="${inflBoard.inflNickname}"> 
                </div>
                
                <div id="inflConcept">
                    <input id="inflConcept-name" type="text" name="inflConcept" value="${inflBoard.inflConcept}">
                </div><br><br><br>
                
                <div id="inflPlatform">
                    플랫폼명
                </div>
                <div id="inflPlatform-detail">
                	<%--${infl.inflPlatform}--%>
	                <select id="inflPlatform-name" name = "inflPlatform" value="${inflBoard.inflPlatform}">
						<option value="instagram">인스타</option>
						<option value="youtube">유튜브</option>
						<option value="blog">블로그</option>
					</select>
				</div>
                
                <div id="inflUrl">
                    개인채널
                </div>
                <div id="inflUrl-detail">
                    <input type="text" id="inflUrl-name" name="inflUrl"  value="${inflBoard.inflUrl}"  >
                </div>
                
                <div id="follower">
                    팔로워수
                </div>
                <div id="follower-detail">
                	<%--<input text="${infl.inflFollower}"--%>
                    <input type="text" id="follower-name" name="inflFollower"  value="${inflBoard.inflFollower}" >
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
                        이메일
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="inflEmail" value="${inflBoard.inflEmail}" >
                    </div>

                    <div id="inflIntro">
                        자기 소개
                    </div>
                    <div id="inflIntro-detail">
                        <textarea id="real-product-detail" name="inflIntro" rows="10" cols="50"  value="" >${inflBoard.inflIntro}</textarea>
                    </div>
                   
            	<button type="submit" class="add-button">수정하기</button>
                </div>
        </div>
        </form>
	</main>
	<jsp:include page = "/WEB-INF/views/include/footer.jsp"></jsp:include>
	<script>
		function readURL(input) {
		  if (input.files && input.files[0]) {
		    var reader = new FileReader();
		    reader.onload = function(e) {
		      document.getElementById('preview').src = e.target.result;
		    };
		    reader.readAsDataURL(input.files[0]);
		  } else {
		    document.getElementById('preview').src = "";
		  }
		}
	</script>
</body>
</html>