<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Document</title>
	</head>
	<link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/dmlist2.css">
</head>
<body>
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    <div class="DajangContainer">
        <nav>
            <div Class="navContainer">
	            <div class="listContents">
	         <!-- <a href='/dm/write'"> -->   
		            <a href="<%= request.getContextPath() %>/dm/write">
		                <button>DM</button>
		            </a> <!--쪽지보내기-->
	            </div> 
            </div>
        </nav>
    
        <main>
            <div class="mainContainer">
                <h3>받은DM</h3>
            
                    <div class="search-group">
                        <form action="/dm2/search" method="get">
                            <select name="totalDmSelect" id="inputSelect">
                                <option value="totalDm">DM전체</option>
                                <option value="sendDm">보낸DM</option>
                             <!-- <option value="block1Tag">차단DM</option> <!--차단 진행할 경우 선택진행--> -->   
                            </select>
                        </form>    
                        
                            <span id="inputBox">
                                <input type="search" name="searchKeyword" placeholder="대화내용, 작성자 검색">
                                <input type="submit" value="검색" id="serachInput">
                            </span>
                            
                            <span id= "buttonBox">
                                <button type = "submit" id="magnifierBtn">
                                    <img src="../resources/images/icons8-돋보기-30.png" alt="send" id="magnifierBtnIcon">
                                </button>
                        	</span>
                    </div>    
                    <div class="action-group">
                        <span id="action">
                            <button id="delete">삭제</button>
                            <button id="reply" onclick="location.href='/dm/reply'">답장</button>
                            <button id="block2Tag">차단</button> <!--차단 진행할 경우 선택진행-->
                        </span>
                    </div>
    
                    <div class="list-group">
                        <table class="dm-table">
                            <thead>
                                <tr>
                                    <td><input type="checkbox" checked></td>
                                    <th class="table listNo">No</th>
                                    <th class="table sendler">보낸사람</th>
                                    <th class="table contents">내용</th>
                                    <th class="table date">날짜</th>
                                    <th class="table block">차단</th> <!--차단 진행할 경우 선택진행-->
                                </tr>
                                </div>
                            </thead>
                            <tbody>
                                <div class="listContents" onclick="location.href='/dm/detail'">
                                    <c:forEach items="${dmList }" var="msg" varStatus="i" >
                                        <tr>
                                            <td class="table listno">${(page.currentPage-1)*10 + i.index + 1}</td>
                                            <td class="table sendler">${msg.sendId }</td>
                                            <td class="table contents"><a href="/dm/detail?dmNo=${msg.dmNo }">${msg.dmContents }</a></td>
                                            <td class="table date">${msg.sendTime }</td>
<%--                                             <td class="table block">${list.차단 }</td> <!--차단 dm에 추가해야하지? ->해야함. 차단 진행할 경우 추가하고 선택진행--> --%>
                                        </tr>
                                    </c:forEach>
                                </div>
                            </tbody>
                        </table>
                    </div>
            
                    <div class="pagination">
                        <c:if test="page.startNavi ne 1">
                            <a href="/dm2/list?currentPage=${page.startNavi-1 }">&lt;</a>
                        </c:if>
                        <c:forEach begin="${page.startNavi}" end="${page.endNavi }" var="i">
                            <a href="/dm2/list?currentPage=${i }">${p }</a> 
                        </c:forEach>
                        <c:if test="${page.endNavi ne page.maxPage }">
                            <a href="/dm2/list?currentPage=${page.endNavi+1 }">&gt;</a>
                        </c:if>
                    </div>
	                    
	            </div>
	        </main>
	    </div>
	</body>
</html>