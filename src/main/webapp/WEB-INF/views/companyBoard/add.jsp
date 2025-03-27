<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기업회원 홍보 게시판 - 등록</title>
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/inflBoardAdd.css">
</head>
<body>
<jsp:include page = "/WEB-INF/views/include/header.jsp"></jsp:include>
<div id="contrainer">
	<main>
	<form action ="/companyboard/add" method="post" enctype="multipart/form-data">
		<div id="img-side">
            <div id="img-box">
			    <img id="preview" src="..${CompanyBoardVO.filePath }">
                제품이미지 파일 : <span><a href="..${CompanyBoardVO.filePath }">${companyboard.fileName }</a></span>
				<input type="file" name="uploadFile" onchange="readURL(this)">
            </div>
        </div>
        <div id="intro-side">
            <div id="intro-box">

                <div id="name-box">
                	<%--${company.companyName}--%>
                    <input id="infl-name" type="text" name="brandName" placeholder="브랜드명 입력"> 
                </div>
                
                <div id="inflConcept">
                    <input id="inflConcept-name" type="text" name="productName" placeholder="제품명 입력">
                </div><br><br><br>
                
                <div id="inflPlatform">
                    책정가격
                </div>
                <div id="inflPlatform-detail">
                	<input type="text" id="inflUrl-name" name="productPrice" placeholder=" 가격 입력">
				</div>
                
                <div id="follower">
                    회사 홈페이지
                </div>
                <div id="follower-detail">
                    <input type="text" id="follower-name" name="companyUrl" placeholder="홈페이지 주소 입력">
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
                        <input type="text" id="" name="companyIntro" placeholder="내용을 입력해주세요">
                    </div>
                    <div id="d1">
                        모집 공고
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyPosting" placeholder="내용을 입력해주세요">
                    </div>

                    <div id="inflIntro">
                        제품 상세
                    </div>
                    <div id="inflIntro-detail">
                        <textarea id="real-product-detail" name="productInfo" rows="10" cols="50" placeholder="내용을 입력해주세요"></textarea>
                    </div>
                    <div id="inflIntro">
                        크리에이터에게
                    </div>
                    <div id="inflIntro-detail">
                        <textarea id="real-product-detail" name="forCreator" rows="10" cols="50" placeholder="내용을 입력해주세요"></textarea>
                    </div>
                    
                    		<input type="hidden" name="companyId" value="${companyBoard.companyId }">
                    <!--                    로그인 후에 위를 살리고 아래를 지우면됨 -->
<!--                     <div id="d1"> -->
<!--                         아이디 -->
<!--                     </div> -->
<!--                     <div id="d2"> -->
<!--                         <input type="text" id="" name="companyId" placeholder="내용을 입력해주세요"> -->
<!--                     </div> -->
                    <div id="d1">
                        이메일
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyEmail" placeholder="내용을 입력해주세요">
                    </div>
                    <div id="d1">
                        전화번호
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyPhone" placeholder="내용을 입력해주세요">
                    </div>
                   
            	<button type="submit" class="add-button">등록하기</button>
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