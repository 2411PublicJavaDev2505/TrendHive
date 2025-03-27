<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DM 목록</title>
	<link rel="stylesheet" href="../resources/css/header.css">
    <link rel="stylesheet" href="../resources/css/footer.css">
    <link rel="stylesheet" href="../resources/css/dmlist2.css">
	</head>
	<body>
	    <jsp:include page="/WEB-INF/views/include/header.jsp" />
	    <div class="DajangContainer">
	        <nav>
	            <div class="navContainer">
			    <div class="listContents">
			        <button onclick="location.href='<%= request.getContextPath() %>/dm2/write'">DM</button>
			        
			    </div>
			</div>
	        </nav>
	    
	        <main>
	            <div class="mainContainer">
	                <h3>받은DM</h3>
	            
	                    <div class="search-group">
	                        <form id="dmForm" action="/dm2/list" method="get">
	                            <select name="totalDmSelect" id="totalDmSelect">
	                                <option value="totalDm">전체DM</option>
	                                <option value="sendDm">받은DM</option>
	                                <!-- <option value="block1Tag">차단DM</option> <!--차단 진행할 경우 선택진행-->
	                            </select>
	                            
	                            <input type="search" name="searchKeyword" placeholder="대화내용, 작성자 검색" value="${param.searchKeyword}">
	                            <button type = "submit" id="magnifierBtn">
	                                <img src="../resources/images/icons8-돋보기-30.png" alt="search">
	                            </button>
	                        </form>    
	                    </div> 
	                    <div class="list-group">
	                        <table class="dm-table">
	                            <thead>
	                                <tr>
								        <!-- 전체 선택 체크박스 -->
								        <td><input type="checkbox" id="selectAll" onclick="clickCheckboxes(this)"></td>
								        <th class="table listNo">No</th>
								        <th class="table sendler">보낸사람</th>
								        <th class="table receiver">받은사람</th>
								        <th class="table contents">내용</th>                            
								        <th class="table reply">답장</th>                            
								        <th class="table delete">삭제</th>                            
								    </tr>
	                            </thead>
	                            <tbody>
	                                		<div class="listContents" onclick="location.href='/dm2/detail'" />
	                                    <c:forEach items="${dmList }" var="msg" varStatus="i" >
<!-- 										<input type="text" name="dmSubject" /> -->
<!-- 										<textarea name="dmContent"></textarea> -->
		                                        <tr>
		                                        	<td><input type="checkbox" class="dm-checkbox"  id="dmCheckbox-${i.index}" onclick="updateSelectAll()"></td>
		                                            <td class="table listno">${(page.currentPage-1)*10 + i.index + 1}</td>
		                                            <td class="table sendler">${msg.sendId }</td>
		                                            <td class="table receiver">${msg.receiveId }</td>
		                                            <td class="table contents">
		                                            	<a href="/dm2/detail?dmNo=${msg.dmNo}">${msg.dmContents }</a>
		                                            </td>
													<td><button type="button" onclick="document.getElementById('dmForm').submit();">답장</button></td>
													<form id="dmForm" action="receiveId" value="${dm.receiveId }"></form>
													
													<td><button onclick="deleteDm(${msg.dmNo});" id="delete" >삭제</button></td>
		                                        </tr>
	                                    </c:forEach>
	                                </div>
	                            </tbody>
	                        </table>
	                    </div>
	                    
	                <div class="pagination">
	                	<tr>
	                		<td colspan="10" align="center">
			                    <c:if test="${startNavi ne 1 }">
									<a href="/dm2/list?page=${startNavi-1 }" class="prev">이전;</a>
								</c:if>
								<c:forEach begin="${startNavi }" end="${endNavi }" var="p" >
									<a href="/dm2/list?page=${p }">${p }</a>
								</c:forEach>	
								<c:if test="${endNavi ne maxPage}">
									<a href="/dm2/list?page=${endNavi+1 }" class="next">다음</a>
								</c:if>
							</td>
						</tr>	
	                </div>
	           	</div>
	         </main>
	         </div>
		    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
			<script>
			document.getElementById("totalDmSelect").addEventListener("change", function() {
				document.getElementById("dmForm").submit();
			})
			
			// 삭제 클릭하면 알림
			function deleteDm(dmNo) {
				var result = confirm("dm을 삭제하시겠습니까?");
				if (result) {
					location.href = "/dm2/delete?dmNo=" + dmNo;
				}
			}
			// 답장 페이지로 이동 send.jsp
			function replySelected(dmNo) {
				window.location.href = '/dm2/send?dmNo=' + dmNo;
			}
			
			// 전체 선택 체크박스를 클릭하면 개별 체크박스들을 모두 선택하거나 해제
		    function clickCheckboxes(selectAllCheckbox) {
		        var checkboxes = document.querySelectorAll('.dm-checkbox');
		        checkboxes.forEach(function(checkbox) {
		            checkbox.checked = selectAllCheckbox.checked;
		        });
		    }

		    // 개별 체크박스 클릭 시 전체 선택 체크박스의 상태를 업데이트
		    function updateSelectAll() {
		        var checkboxes = document.querySelectorAll('.dm-checkbox');
		        var selectAllCheckbox = document.getElementById('selectAll');
		        selectAllCheckbox.checked = checkboxes.length === [...checkboxes].filter(checkbox => checkbox.checked).length;
		    }
			
			</script>
	</body>
</html>