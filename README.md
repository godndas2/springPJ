## 회원관리 + 계층형 게시판 + 채팅 1:1( 추후 가능하다면 1:N )
## Git ( Ctrl + N - git 검색으로 바로 찾을 수도 있음 )
- Eclipse - window - showview - other.. - git - git repositories(추가)<br/>
- Eclipse - window - showview - other.. - git - git staging(추가)<br/>
- eclipse -> git 업로드 방법<br/>
- git repositories(마우스 오른쪽 클릭) - pull - git staging 탭으로 이동 - upstaged changes에 있는 업로드 하려는 파일선택(.java, .xml, .jsp)<br/>
- staged changes에 추가 되었으면 오른쪽 commit Message에 메시지를 입력해주고 하단에 Commit을 클릭<br/>
- git repositories(마우스 오른쪽 클릭) - push to upstream 클릭 - 완료(github page에 잘 올라갔는지 확인해주는 센스..!)<br/>
##### 처음부터 올라가 있는 파일이 있을 수 있는데 무시하고 업로드하려는 파일만 추가해주면 됩니다.

# 개발환경 
[SQL Developer 설치](https://all-record.tistory.com/76)
[MySQL tool 사용법](https://ooz.co.kr/253)

```
Eclipse Oxygen, jdk8, MySQL5.6, Mybatis, Maven, ...
```
## 프로젝트 구조
<h5>DTO, Controller, DAO, DAOImpl, Service, ServiceImpl, Mapper.xml, .jsp</h5>

# 회원관리( CRUD + 로그인, 로그아웃 )
<h2>Member</h2>

```
create table member (
userid varchar not null,
passwd varchar not null,
name varchar not null,
email varchar,
join_date datetime default now(),
primary key(userid)
);
```

# 게시판(기본기능)

```
로그인 후 게시물 등록, 수정 가능
글쓰기( 에디터 적용 )
게시물 상세정보, 조회수 증가
게시물 수정
게시물 삭제(delete방식)
게시물 삭제(update방식)
검색기능
페이징
```
<h2>Board</h2>

```
create table board (
bno int not null auto_increment primary key,
title varchar not null,
content varchar not null,
writer varchar not null,
regdate datetime default now(),
viewcnt int default 0,
);
```

# 게시판( + 파일업로드 )

```
Ajax로 파일첨부
첨부파일 목록, 다운로드, 삭제
수정화면에서 새롭게 파일 업로드가능
```
<h2>Attach</h2>

```
-- drop table attach cascade constraints;

create table attach(
fullName varchar not null auto_increment primary key,
bno int not null,
regdate datetime default now()
);

-- fk 제약조건 추가

alter table attach add constraint fk_board_attach foreign key(bno) references board(bno);
```

# 게시판( + 댓글 기능)

```
목록에 댓글 갯수 표시
댓글 페이징
비밀댓글 쓰기, 표시
댓글 수정,삭제 기능
```
<h2>Reply</h2>

```
-- drop table reply cascade constraints;

create table reply (
rno int not null auto_increment primary key,
bno number default 0,
replytext varchar not null,
replyer varchar not null,
regdate datetime default now(),
updatedate date default now()
);

-- fk 제약조건 추가

alter table reply add constraint fk_board foreign key(bno) references board(bno);
```

