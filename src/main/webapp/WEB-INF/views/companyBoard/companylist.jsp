<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/companylistmain.css">
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
        <h1 id="subject">다양한 기업들을 만나보세요</h1>
        <main>
                <div id="search-div">
                    <div id="search">
                        <select class="search-select" name="searchCondition">
                                <option value="제품명"<c:if test="${searchCondition eq 'productName' }"></c:if>>제품명</option>
                                <option value="내용"<c:if test="${searchCondition eq 'content' }"></c:if>>내용</option>
                                <option value="회사명"<c:if test="${searchCondition eq 'companyName' }"></c:if>>회사명</option>
                        </select>
                        <input type="text" class="search-input" name="searchKeyword" placeholder="검색어를 입력하세요">
                        <button>검색</button>
                        
                    </div>
                </div>
                <hr>
                <div class="list">
                <div id="img1">
                    <a href="#" onclick="">
                        <div id="image">이미지</div>
                        <div id="img-text">회사명-제품명</div>
                    </a>
                </div>
                <div id="img2">
                    <a href="#" onclick="">
                        <div id="image">이미지</div>
                        <div id="img-text">회사명-제품명</div>
                    </a>
                </div>
                <div id="img3">
                    <a href="#" onclick="">
                        <div id="image">이미지</div>
                        <div id="img-text">회사명-제품명</div>
                    </a>
                </div>
                <div id="img4">
                    <a href="#" onclick="">
                        <div id="image">이미지</div>
                        <div id="img-text">회사명-제품명</div>
                    </a>
                </div>
                <div id="img5">
                    <a href="#" onclick="">
                        <div id="image">이미지</div>
                        <div id="img-text">회사명-제품명</div>
                    </a>
                </div>
                <div id="img6">
                    <a href="#" onclick="">
                        <div id="image">이미지</div>
                        <div id="img-text">회사명-제품명</div>
                    </a>
                </div>
            </div>
            <div class="pagination">
                <c:if test="${startNavi ne 1 }">
                    <a href="/company/list?currentPage=${startNavi - 1 }" class="prev">&lt;</a>
                </c:if>
                <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
                    <a href="/company/list?currentPage=${p }">${p }</a>
                </c:forEach>
                <c:if test="${endNavi ne maxPage }">
                    <a href="/company/list?currentPage=${endNavi + 1 }" class="next">&gt;</a>
                </c:if>
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