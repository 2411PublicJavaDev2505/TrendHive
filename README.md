# 인플루언서와 기업을 쉽게 연결하는 매칭 사이트
![image](https://github.com/user-attachments/assets/5cbfb038-31cc-4459-a075-fa203382f955)

# 팀 프로젝트 소개
![팀프로젝트소개](https://github.com/user-attachments/assets/a7e31f36-9063-4409-a0f5-9da1f9a8a046)

# 역할 분담
![담당역할](https://github.com/user-attachments/assets/f069b82a-277e-4f3b-9e17-d9ba029dd861)

# 차별성
![차별성](https://github.com/user-attachments/assets/328925fb-2e6d-418e-ab38-495303d6cba2)

# 프로젝트 개발환경
+ DB : Oracle 18c 버전 이용
+ sts-3.9.18 버전 사용

# 프로젝트 실행 환경 구축(로컬)
1. 오라클 23 설치 후 로컬에 db 계정 생성
2. 계정 생성 후 권한 부여 및 테이블 생성

+ 테이블, 시퀀스 생성 및 데이터 삽입 스크립트<br>
+ [컴백현_SQL 프로젝트 테이블.txt](https://github.com/user-attachments/files/20219996/_SQL.txt)

3. sts에 및 root-context.xml 파일을 이용해 db와 연결
```
# Oracle Connection Setting
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username
spring.datasource.password
```

---

## 1. 기술스택 ##

![HTML](https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS](https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
<br>
![Tomcat](https://img.shields.io/badge/apache%20tomcat-F8DC75?style=for-the-badge&logo=apache%20tomcat&logoColor=black)
![GitHub](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)
![Oracle](https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
<br>
![Adobe Express - file](https://github.com/user-attachments/assets/96f9b19a-0747-43a2-985b-e24c0649bb07)
![Java](https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white)
![Canvas](https://img.shields.io/badge/canvas-E72429?style=for-the-badge&logo=canvas&logoColor=white)

## 2. 브랜치 전략 ## 
+ 팀원 각자의 브랜치를 만들어 개발 진행
+ 기능 구현이 완료되면 Main 브랜치에 병합
  
![github_flow](https://github.com/user-attachments/assets/40a24663-eb69-4a5d-aad2-5cccab61a7a8)


## 3. 프로젝트 구조 ## 
[TrendHive 프로젝트구조.pdf](https://github.com/user-attachments/files/20273475/TrendHive.pdf)

## 4. 주요기능 ## 

| **기능명**             	| **상세**                                                                                                                                              	|
|------------------------	|-------------------------------------------------------------------------------------------------------------------------------------------------------	|
|  크리에이터 회원 가입  	| 사용자는 정보를 입력하여 회원가입을 할 수 있으며 인증(기업회원, 크리에이터)이 필요하다.                                                               	|
|      기업회원 가입     	| 사용자는 정보를 입력하여 회원가입을 할 수 있으며 인증(기업회원, 크리에이터)이 필요하다.                                                               	|
| 크리에이터 회원 로그인 	| 회원가입 시 입력한 아이디를 저장하여 다시 입력할 필요 없고 비밀번호 입력후 기업로그인과 크리에이터 로그인을 할수 있다.                                	|
|     기업회원 로그인    	| 회원가입 시 입력한 아이디를 저장하여 다시 입력할 필요 없고 비밀번호 입력후 기업로그인과 크리에이터 로그인을 할수 있다.                                	|
|      비밀번호 찾기     	| 아이디(선택사항), 이메일을 입력받아서 해당하는 회원이 존재하면 비밀번호를 재설정 할수있는 링크를 발송한다.                                            	|
|     회원 정보 수정     	| 기존의 닉네임들과 중복되지 않은 닉네임으로 닉네임을 변경할 수 있고, 비밀번호 설정 규칙에 맞게 비밀번호등을 새롭게 설정할 수 있다.                     	|
|        회원탈퇴        	| 이메일로 회원 탈퇴코드 확인 후 회원 탈퇴를 진행할 수 있다.                                                                                            	|
|       회원리스트       	| 회원리스트 검색창과 리스트 창 구현                                                                                                                    	|
|     공지사항 게시판    	| 공지사항 게시판 구현                                                                                                                                  	|
|        메인화면        	| 각 페이지에 연결할수 있고 로그인후 DM,정보수정, 로그아웃이 가능하다 (메인화면 구현, 헤더, 푸터 구현 및 css)                                           	|
|         게시판         	| 게시판 구현 및 css                                                                                                                                    	|
|      게시글  조회      	| 등록된 전체 게시글을 최근 게시글부터 순차적으로 볼 수 있다.                                                                                           	|
|       게시글 검색      	| 제목, 활동 주제을 선택하여 전체상품에서 검색가능하다.                                                                                                 	|
|       게시글 작성      	| 크리에이터명, 플랫폼명, 개인채널링크, 이메일, 활동 주제, 자기 소개, 팔로워수, 홍보 이미지 첨부가 포함된다.                                            	|
|       게시글 수정      	| 크리에이터명, 플랫폼명, 개인채널링크, 이메일, 활동 주제, 자기 소개, 팔로워수, 홍보 이미지 첨부가 수정 가능하다.                                       	|
|       게시글 삭제      	| 본인이 작성한 게시글일 경우 삭제 가능하다.                                                                                                            	|
|    게시글 상세페이지   	| 로그인한 회원이면 누구나 조회가능하다.                                                                                                                	|
|     공지사항 리스트    	| 공지사항 리스트를 최근에 등록한 순서대로 확인할 수 있다. (제목, 내용, 작성자, 날짜 및 시간)                                                           	|
|   공지사항 상세 내용   	| 공지사항의 상세 내용을 제목을 클릭하여 확인 가능하다. 상세 내용에서는 제목, 작성자, 내용을 확인할 수 있으며 누구나 조회할 수 있다.                    	|
|      공지사항 작성     	| 공지사항을 작성할 수 있다. 단, admin이라는 아이디를 가진 관리자 계정으로만 작성 가능하다.                                                             	|
|   공지사항 수정/삭제   	| 공지사항을 수정/삭제할 수 있다. 단, admin이라는 아이디를 가진 관리자 계정으로만 수정/삭제가 가능하다.                                                 	|
|      공지사항 검색     	| 공지사항의 제목, 내용으로 검색 가능하다.                                                                                                              	|
|   크리에이터 회원가입  	| 사용자는 정보를 입력하여 회원가입을 할 수 있으며 작성한 정보의 요구 조건이 충족되면 바로 가입 가능하다.                                               	|
|      기업 회원가입     	| 사용자는 정보를 입력하여 회원가입을 할 수 있으며 작성한 정보의 요구 조건이 충족되면 바로 가입 가능하다.                                               	|
|    크리에이터 로그인   	| 사용자는 회원가입한 ID와 PW를 통해 로그인할 수 있으며, 페이지 내에서 사용할 수 있는 기능이 추가된다.                                                  	|
|       기업 로그인      	| 사용자는 회원가입한 ID와 PW를 통해 로그인할 수 있으며, 페이지 내에서 사용할 수 있는 기능이 추가된다.                                                  	|
|        회원 탈퇴       	| 이메일로 회원탈퇴 코드를 확인 후 탈퇴가 가능하다.                                                                                                     	|
|     회원 정보 수정     	| 기존의 닉네임과 중복되지 않는 닉네임으로 변경할 수 있으며 개인정보들을 변경할 수 있다.                                                                	|
|   홍보 게시판 리스트   	| 홍보 게시판 리스트 구현, 한 페이지 당 6개의 게시글을 확인할 수 있으며 초과할 시 다음 페이지로 넘어가게 된다.                                          	|
|       홍보글 등록      	| 게시글의 상세 내용과 똑같은 양식으로 되어 있으며 각 위치에 글 작성, 이미지 삽입이 가능하다.                                                           	|
|       메시지 전송      	| 아이디를 검색하여 수신인을 선택한 후 , 메시지 입력해서 전송버튼을 누르면 전송이 가능하다.                                                             	|
|       메시지 확인      	| 리스트 내역에서 확인하고 싶은 메시지를 클릭하면 받은메시지 내용을 상세 확인할 수 있다.                                                                	|
|       메시지 검색      	| 대화내용, 작성자 검색으로 메시지를 조회할 수 있다. 전체DM, 받은DM으로 대화 리스트 정렬이 가능하다.                                                    	|
|    받은 메시지 삭제    	| 메시지를 체크박스로 클릭해 삭제할 수 있다. 체크박스 전체 클릭도 가능하다. 받은 메시지는 삭제할 수 있으나, 발송된 메시지는 수정하거나 삭제할 수 없다.  	|
|       메시지 차단      	| 메시지를 체크박스로 클릭해 차단할 수 있다. 광고성, 거짓정보 등의 위반 사항이 포함되는 경우 기업회원과 크리에이터는 서로의 메시지를 제한할 수 있다.    	|

## 6. 개발일정 ## 
![개발일정](https://github.com/user-attachments/assets/9c1d1302-9b92-4c61-b7cc-72614d7784bf)

## 7. 화면구현 ## 
## 메인/회원관리 화면: 신호철

![image](https://github.com/user-attachments/assets/3ed892ba-d1e9-4ab8-808d-85a6525111c6)
![image](https://github.com/user-attachments/assets/93a7c045-4d93-40d8-91d9-74d6eea4acbf)
![image](https://github.com/user-attachments/assets/a98eef62-0313-4fe6-b5ae-19c1d1b0c188)
![image](https://github.com/user-attachments/assets/13bb5a0e-4345-43d9-88bb-058278135f4c)
![image](https://github.com/user-attachments/assets/7feaf23f-fcaa-43ee-92a9-a364de1ad99b)
![image](https://github.com/user-attachments/assets/c8f3e8bb-9a4f-4cb2-be2e-f0a4d35a29eb)
![image](https://github.com/user-attachments/assets/b586c677-8584-4496-8e2e-b46dfc4e007f)

---

## 크리에이터/기업 홍보 게시판: 이하나
![image](https://github.com/user-attachments/assets/cdf69908-7c1c-4ee2-8bd4-526249370549)
![image](https://github.com/user-attachments/assets/f10fc170-ad86-4764-8ffc-285b42323251)
![image](https://github.com/user-attachments/assets/d918ca54-81a3-4f79-b8a6-546fe55403c2)
![image](https://github.com/user-attachments/assets/e8f6b802-4ac7-41a2-9a62-053b744f7e48)
![image](https://github.com/user-attachments/assets/02878da4-4292-4692-bc24-e8eb2c672562)

---

## 공지사항/회원관리 화면: 박현서

![image](https://github.com/user-attachments/assets/be7cd2e4-8be9-405d-aa40-490b7363bc6c)
![image](https://github.com/user-attachments/assets/2c62468f-edd6-4c29-b934-0f6757ef4261)
![image](https://github.com/user-attachments/assets/978bef72-d1b0-4e0a-b1d8-6b4e44158233)
![image](https://github.com/user-attachments/assets/87297f37-06b4-4b22-bd10-98be11939459)
![image](https://github.com/user-attachments/assets/82b86a3d-47bf-4113-9a7e-1148c27335b6)
![image](https://github.com/user-attachments/assets/5d5e59b5-80e4-4320-84d3-937248460bb6)

---

## 협업기능 DM 화면 : 채소형
> + ###### DM 보낸사람/받은사람/내용/답장/삭제 확인 가능
> ![DM list 와 최초 DM보내기 화면 합침  수정](https://github.com/user-attachments/assets/feca3ffb-5cdb-476c-9ba2-dcbf998b3d2a)
> + ###### 다수에게 메시지 전송이 가능하다.
> ![dm 여러명 보내기](https://github.com/user-attachments/assets/fb47d858-20dd-4693-9096-a5b0d097ca89)
> + ###### 파일선택을 누르면 파일첨부가 가능하다.
> ![파일첨부](https://github.com/user-attachments/assets/d2b27d32-a9e1-4d15-b764-94d956b6ec39)
> ![파일첨부됨](https://github.com/user-attachments/assets/948b800f-d981-4071-804b-631da8d478d6)
> + ###### 받은DM의 내용을 클릭하면 상세확인이 가능하다.
>![image](https://github.com/user-attachments/assets/e04902fe-a92d-4f90-8546-1e127db9a903)
> + ###### 받은 메시지 삭제 버튼을 누르면 alert modal 창이 뜬다.
>![image](https://github.com/user-attachments/assets/d6c79061-fc9e-45db-b127-53ca5edbae1f)
>![삭제모달2](https://github.com/user-attachments/assets/945c50fc-d5d1-43ed-824a-f1a4ae0d7edc)

## 8. 프로젝트 후기 ## 
+ 신호철:
 그냥 할수 있는거만 알고 있는거만 팀원들에게 피해가 가지 않게 하자고 시작한 세미프로젝트.
생각보다 많은걸 할수 있었고 생각보다 더 할수 있는게 많은 시간이었다.
프로젝트의 완성과정을 조금은 이해 할수 있었으며 파이널 프로젝트에 대한 대비를 제대로 한것 같은 느낌이다.

+ 이하나:
  CSS와 로그인기능이 쉬울줄 알고 미뤘다가 다른 부분들에도 영향을 미칠수 있음을 느꼈습니다.
또한 협업에 있어서 팀원이 구현해 놓은 부분들에 대한 세심한 배려가 필요하다는 점도 다시한번 알게 되었습니다.
팀원들의 다양한 각자의 방식을 통해 배운점도 많습니다. 
마약의 힘으로 많은 도움주신 날개잃은 천사 선생님께도 너무 감사드립니다~ 모두 고생하셨습니다!

+ 박현서:
 시간이 널널할 것이라고 생각했으나 
제가 너무 얕봤던 것 같습니다..
완벽 구현을 못 하여 너무 아쉽지만, 구현이나 오류 쪽에서 더 많은 것을 알아가는 좋은 경험이었으며,
팀원과의 소통과 네이밍의 통일성이 정말 중요하다는 것을 깨닫게 된 것 같습니다.
이 경험을 토대로 파이널 프로젝트에선 더 활약할 수 있을 것 같네요
함께해주신 팀원 분들, 강사님께 정말 감사드립니다!

+ 채소형:
 DM 화면 구현이라는 쉽지않은 기능을 맡아서 막막했지만 사용자가 편리하게 상호작용할 수 있는 기능을 만들고 싶은 열정이 더 컸습니다. 단순히 기능 하나를 구현하는 것을 넘어서, 기획 단계에서 구상했던 UI와 흐름을 실제 구현까지 이어가는 것을 목표로 삼고 도전했습니다. 
막상 구현을 시작하니 생각만큼 되지 않아 답답한 순간도 많았습니다. 
하지만 이런 과정을 통해서 코드 한 줄 한 줄에만 집중하던 시각에서 벗어나서, 프로젝트 전체의 기능 흐름과 각 부분의 역할을 이해할 수 있었습니다. 
또한, 팀원들이 빠르게 구현해나가는 모습을 보면서 자극을 받았고, 스스로에게 실망하지 않기 위해 성실히 임해야겠다는 다짐도 다시금 하게 되었습니다. 
아직 하나의 프로젝트가 더 남아있다는 점이 기회라고 생각되어 감사하게 느껴졌고, 이번 경험을 밑바탕 삼아서 더욱 성숙한 자세로 임하고 싶습니다. 
---

# 프로젝트 산출문서
+ 제작과정/협업
![image](https://github.com/user-attachments/assets/b33f78f4-e86a-4dc0-9b8d-7d6fb1dbe999)
+ 요구사항정의서
![image](https://github.com/user-attachments/assets/e49885d4-b3d7-416c-a07f-87aa1838c867)
+ 와이어프레임
![image](https://github.com/user-attachments/assets/80384bda-b517-4e75-9335-085ba4aa6bfa)
+ DB설계(ERD)
![image](https://github.com/user-attachments/assets/16d44a8f-9dbb-4326-849e-a6ff184b07c2)
+ 시퀀스 다이어그램
![image](https://github.com/user-attachments/assets/bcad66ab-a7fb-43dc-b938-4ebbaf7b8d24)
+ 프로젝트 소스 DB<br>
[Uploading 컴백현_SQL 프로젝트 테이블.txt…]()
+ 시연영상<br>
[컴백현 시연영상 통합.zip](https://github.com/user-attachments/files/20224950/default.zip)

