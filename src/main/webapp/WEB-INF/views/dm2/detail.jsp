<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상세페이지 - DM 확인</title>
		<link rel="stylesheet" href="../resources/css/header.css">
		<link rel="stylesheet" href="../resources/css/footer.css">
		<link rel="stylesheet" href="../resources/css/detail.css">
	</head>
	<body>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<div class="outerContainer">
			<div class="innerContainer">
				<div class="btn-Container">
					<div class="deleteBtn">
						<button id="delete" onclick="deleteDm(${dm.dmNo });" >삭제</button>
					</div>
					<div class="replyBtn">
						<button id=reply onclick="location.href='/dm2/send?dmNo=${dm.dmNo }';">답장</button>
					</div>
				</div>
				
				<div class="infoBtn">
					<div class="sendler">
						보낸 사람: <span>${dm.receiveId }</span><br>
				    </div>
					<div class="receiveTime">
						받은 시간: <span>${dm.receiveTime }</span><br>
				    </div>
				</div>
				    
				<div class="dmContents">
		            <label for="content" ></label>
		            <textarea id="content" name="content" required readonly>${dm.dmContents}</textarea><br>
		        </div>
		        
		        <div class="guide">
		        	<p>
		        	읽은 쪽지는 30일 후에 자동으로 삭제됩니다.
				    <br>
				    읽지 않은 카페 단체 쪽지는 3개월 후 자동 삭제됩니다.
				    </p>
		        </div>
			</div>
		</div>
	    
	    <script>
	    	// 삭제 클릭하면 알림
	    	function deleteDm(dmNo) {
				var result = confirm("해당 dm을 삭제하시겠습니까?");
				if (result) {
					location.href = "/dm2/delete?dmNo=" + dmNo;
	    		}
	    	}
	    	
	    	// 답장 페이지로 이동 send.jsp
			function replySelected(dmNo) {
				window.location.href = '/dm2/send?dmNo=' + dmNo;
			}
	    </script>
	</body>
</html>