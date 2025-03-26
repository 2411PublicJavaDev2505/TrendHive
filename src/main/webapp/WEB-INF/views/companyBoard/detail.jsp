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
                        <a href="/companyboard/detail?companyPRNo=${companyBoard.companyPRNo }">
	                            <div class="product-img">
	                            <img src="..${companyBoard.filePath }">${companyBoardVO.filePath }</div>
<!-- 	                            회원정보 연결되면 ${company.companyName}으로 바꿀것 -->
	                            <div class="img-text">${companyBoard.brandName }</div>
                            </a>
                    </div>
                </div>
            <!-- 여기까지 써줘야 한다 -->
            </div>
        </div>

        <div id="intro-side">
            <div id="intro-box">

                <div id="name-box">
                	<%--${company.companyName}--%>
                	<span id="infl-name" name="brandName">${companyBoard.brandName } </span>
                </div>
                <div id="inflConcept">
                	<span id="inflConcept-name" name="productName"><h2>${companyBoard.productName } </h2></span>
                </div><br><br><br>
                
                <div id="inflPlatform">
                    책정가격
                </div>
                <div id="inflPlatform-detail">
                	<%--${infl.inflPlatform}--%>
                	<span id="inflPlatform-name" name = "productPrice"> ${companyBoard.productPrice }</span>
				</div>
                
                <div id="inflUrl">
                    회사 홈페이지
                </div>
                <div id="inflUrl-detail">
                	<span id="inflUrl-name" name="companyUrl" > ${companyBoard.companyUrl } </span>
                </div>
                <div id="inflUrl">
                    이메일
                </div>
                <div id="inflUrl-detail">
                	<span id="inflUrl-name" name="companyEmail" > ${companyBoard.companyEmail } </span>
                </div>
                <div id="inflUrl">
                    전화번호
                </div>
                <div id="inflUrl-detail">
                	<span id="inflUrl-name" name="companyPhone" > ${companyBoard.companyPhone } </span>
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
                	<span id="" name="insertDate"> ${companyBoard.insertDate }</span>
                </div>
				<div id="d1">
                    회사 소개
                </div>
                <div id="d2">
                	<span id="" name="companyIntro"> ${companyBoard.companyIntro }</span>
                </div>
				<div id="d1">
                    모집 공고
                </div>
                <div id="d2">
                	<span id="" name="companyPosting"> ${companyBoard.companyPosting }</span>
                </div>

                <div id="inflIntro">
                    제품 상세
                </div>
                <div id="inflIntro-detail">
                	<span id="real-product-detail" name="productInfo" rows="10" cols="50" >${companyBoard.productInfo }</span>
                </div>
                <div id="inflIntro">
                    크리에이터에게
                </div>
                <div id="inflIntro-detail">
                	<span id="real-product-detail" name="forCreator" rows="10" cols="50" >${companyBoard.forCreator }</span>
                </div>        
            	
	                <button type = "submit" class="add-button">
						<a href = "/companyboard/modify/${companyBoard.companyPRNo }" 
						class="btn" onclick="modifylist">수정하기</a></button>
					<button type = "submit" class="add-button">
						<a href = "/companyboard/delete?companyPRNo=${companyBoard.companyPRNo }"=${companyBoard.companyPRNo }" 
						class="btn" onclick="deletelist">삭제하기</a></button>
					<button type = "submit" class="add-button">
						<a href = "/companyboard/list" class="btn">목록</a></button>
				</div>
        	</div>								
		</main>
		<jsp:include page = "/WEB-INF/views/include/footer.jsp"></jsp:include>

	</div>
</body>
</html>