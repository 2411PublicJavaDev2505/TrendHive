<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<header>
	<div class="top">
		<div class="logo">
			<span class="logo-text" ><a href="/">TrendHive</a> </span>
        </div>
	</div>

    <nav class="nav">
		<ul>
			<li><a href="/common/about">What about Us</a></li>
            <li><a href="/companyboard/list">For Company</a></li>
            <li><a href="/inflboard/list">For Creator</a></li>
            <li><a href="/notice/adminNotice">Notice</a></li>
            <c:choose>
               <c:when test="${sessionScope.loggedIn}">
                    <li><a href="#direct-message">Direct Message</a></li>
                    <li><a href="/company/logout">로그아웃</a></li>
                    <c:choose>
                        <c:when test="${sessionScope.companyId eq 'admin'}">
                            <li><a href="/admin/adminSearch" class="user-welcome">Welcome, ${sessionScope.userName}</a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="/company/update" class="user-welcome">Welcome, ${sessionScope.userName}</a></li>
                        </c:otherwise>
                    </c:choose>
                </c:when>
                <c:otherwise>
                    <li><a href="/company/login">기업 로그인</a></li>
                    <li><a href="/infl/login">크리에이터 로그인</a></li>
                    <li><a href="/company/insert">기업 회원가입</a></li>
                    <li><a href="/infl/insert">크리에이터 회원가입</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
	</nav>
</header>