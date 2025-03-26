<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기업회원 홍보 게시판 - 수정</title>
    <link rel="stylesheet" href="../../resources/css/footer.css"><!-- @GetMapping("/modify/{companyPRNo}")투뎁스//라서 ../한번더 추가 -->
    <link rel="stylesheet" href="../../resources/css/header.css">
    <link rel="stylesheet" href="../../resources/css/inflBoardAdd.css">
</head>
<body>
<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>
<div id="contrainer">
	<main>
	<form action ="/companyboard/modify" method="post" enctype="multipart/form-data">
		<input type="hidden" name="companyId" value="${companyBoard.companyId }">
		<div id="img-side">
            <div id="img-box">
			    <img id="preview" src="..${companyBoard.filePath }">
                제품이미지 파일 : <span><a href="..${companyBoard.filePath }">${companyBoard.fileName }</a></span>
				<input type="file" name="reloadFile" onchange="readURL(this)">
            </div>
        </div>
        <div id="intro-side">
            <div id="intro-box">

                <div id="name-box">
                	<%--${company.companyName}--%>
                    <input id="infl-name" type="text" name="brandName" value="${companyBoard.brandName}">
                </div>
                
                <div id="inflConcept">
                    <input id="inflConcept-name" type="text" name="productName" value="${companyBoard.productName}">
                </div><br><br><br>
                
                <div id="inflPlatform">
                    책정가격
                </div>
                <div id="inflPlatform-detail">
                	<input type="text" id="inflUrl-name" name="productPrice" value="${companyBoard.productPrice}">
				</div>
                
                <div id="follower">
                    회사 홈페이지
                </div>
                <div id="follower-detail">
                    <input type="text" id="follower-name" name="companyUrl" value="${companyBoard.companyUrl}">
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
                        회사 소개
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyIntro" value="${companyBoard.companyIntro}">
                    </div>
                    <div id="d1">
                        모집 공고
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyPosting" value="${companyBoard.companyPosting}">
                    </div>

                    <div id="inflIntro">
                        제품 상세
                    </div>
                    <div id="inflIntro-detail">
                        <textarea id="real-product-detail" name="productInfo" rows="10" cols="50" >${companyBoard.productInfo}</textarea>
                    </div>
                    <div id="inflIntro">
                        크리에이터에게
                    </div>
                    <div id="inflIntro-detail">
                        <textarea id="real-product-detail" name="forCreator" rows="10" cols="50" >${companyBoard.forCreator}</textarea>
                    </div>
                    
                    <div id="d1">
                        이메일
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyEmail" value="${companyBoard.companyEmail}">
                    </div>
                    <div id="d1">
                        전화번호
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyPhone" value="${companyBoard.companyPhone}">
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
</div>
</body>
</html>