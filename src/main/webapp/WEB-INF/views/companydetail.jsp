<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <header>
        <div class="top">
            <div class="logo">
                <span class="logo-text">TrendHive</span>
            </div>
        </div>
        <nav class="nav">
            <ul>
                <li><a href="#about">What about Us</a></li>
                <li><a href="#company">For Company</a></li>
                <li><a href="#creator">For Creator</a></li>
                <li><a href="#notice">Notice</a></li>
                <li><a href="#login">로그인</a></li>
                <li><a href="#signup">회원가입</a></li>
            </ul>
        </nav>
    </header>
</body>
    <main>
        <div id="img-side">
            <div id="img-box">
                <img src="">
            </div>
        </div>
        <div id="intro-side">
            <div id="intro-box">
                <div id="name-box">
                    <input id="company-name" type="text" name="companyName" placeholder="회사명 입력">
                </div>
                <div id="product-box">
                    <input id="product-name" type="text" name="productName" placeholder="제품명 입력">
                </div>
                <div id="detail-box">
                    <input type="text" id="detail" name="" placeholder="제품 설명란">
                </div>
                <div id="price">
                    책정가격
                </div>
                <div id="price-detail">
                    <input type="text" id="price-name" name="productPrice" placeholder="가격 입력">
                </div>
                <div id="brand">
                    브랜드
                </div>
                <div id="brand-detail">
                    <input type="text" id="brand-name" name="brnadName" placeholder="브랜드명 입력">
                </div>
                <div id="url">
                    회사 홈페이지
                </div>
                <div id="url-detail">
                    <input type="text" id="url-name" name="companyUrl" placeholder="주소 입력">
                </div>
            </div>
        </div>
        <div id="bottom-div">
                <div id="subject">
                    <h1 id="product-detail">제품 상세</h1>
                    <hr>
                </div>
                <div id="bottom-detail">
                    <div id="d1">
                        회사 소개
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyIntro" placeholder="회사 소개글">
                    </div>
                    <div id="d1">
                        모집 공고
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyPosting" placeholder="모집 공고">
                    </div>
                    <div id="d1">
                        회사 사이트
                    </div>
                    <div id="d2">
                        <input type="text" name="companyUrl" placeholder="사이트 URL">
                    </div>
                    <div id="pro-detail">
                        제품 상세
                    </div>
                    <div id="prod-detail">
                        <textarea id="real-product-detail" name="productInfo" rows="10" cols="50" placeholder="제품 상세"></textarea>
                    </div>
                    <div id="for-infl">
                        크리에이터에게
                    </div>
                    <div id="for-infl-detail">
                        <textarea id="real-infl-detail" name="forCreator" rows="10" cols="50" placeholder="크리에이터 공지"></textarea>
                    </div>
                    <div id="d1">
                        이메일
                    </div>
                    <div id="d2">
                        <input type="text" id="" name="companyEmail" placeholder="이메일">
                    </div>
                    <div id="d1">
                        전화번호
                    </div>
                    <div id="d2">
                        <input type="text" name="companyPhone" placeholder="전화번호">
                    </div>
                </div>
        </div>
    </main>
<footer>
    <nav class="footer-nav">
        <ul>
            <li><a href="#intro">TrendHive 소개</a></li>
            <li><a href="#terms">이용약관</a></li>
            <li><a href="#information">개인정보처리방침</a></li>
            <li><a href="#policy">운영・관리방침</a></li>
        </ul>
    </nav>
    <div class="footer-logo">
        <span class="footerlogo-text">TrendHive</span>
    </div>
    <p>&copy; 2025 TrendHive. All rights reserved.</p>
</footer>
</html>