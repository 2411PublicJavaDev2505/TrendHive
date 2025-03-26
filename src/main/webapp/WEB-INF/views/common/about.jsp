<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>이용약관</title>
	<link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/about.css">
</head>
<body>
	<header>
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    </header>
    <div class="container">
        <div class="about-top">
            <div class="logo">
                <span class="about-logo-trend">TrendHive</span>
            </div>
        </div>
    
        <form class="form">
            <div class="form-group">
                <div class="agree">
                    <p>
                        <strong>TrendHive는?</strong> <br/><br/>
                        트렌드하이브 사이트는 인지도를 높이고자 하는 크리에이터와 홍보를 하고자 하는 중소기업 간의 매칭을 돕는 사이트입니다. <br/><br/>
                        트렌드하이브 사이트는 회원제로 운영되고, 홍보글을 통해 서로 매칭할 기회를 갖습니다.<br/><br/> 
                        각 분야에서 인정할 만한 권위나 이력이 있거나, 트렌드하이브 사이트에서의 신뢰할 만하고 꾸준한 활동을 하는 크리에이터 및 지속적인 후원을 하는 기업회원의 경우, 프리미엄마크를 부여받아 노출이 더 유리해질 수 있습니다.<br/><br/>
                        - 기업회원 회원가입 요구사항
                        아이디, 비밀번호, 이메일, 주소, 연락처, 대표명, 회사명, 사업자등록번호, 사업자등록증 첨부

                        - 크리에이터 회원가입 요구사항<br/>
                        아이디, 비밀번호, 이메일, 주소, 연락처, 이름, 채널명, 플랫폼(URL), 생년월일, 성별<br/><br/>

                        <채널 별 연동 기준><br/>
                        인스타그램: 팔로워수 1만 명 이상 + 프로페셔널 계정<br/>
                        네이버블로그: 이웃수 1천 명 이상, 전월 방문 횟수 1만 명 이상<br/>
                        * * 전월 방문 횟수 확인: 블로그 관리/통계 > 내 블로그 통계 > 방문 분석 > 방문 횟수 > 월간 >  전월 데이터 확인
                        유튜브: 구독자 수 1만 명 이상<br/> 
                        ※ 가입 후, 트렌드하이브 운영 정책에 위반되는 콘텐츠나 활동이 있을 경우, 이용이 제한될 수있습니다.<br/>
                        채널 별 가입 상세 기준은 홈페이지 내 고객센터를 통해 확인가능합니다.<br/><br/>

                        회원 가입 후 로그인을 통해 사이트에 접근할 수 있고, 상호간 매칭을 통한 협업이 가능합니다.
	
                    </p>
                </div>
            </div>
    </div>
    <footer>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </footer>
</body>
</html>