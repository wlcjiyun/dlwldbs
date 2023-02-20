# 한 줄 주석
-- 한 줄 주석
/* 여러 줄 주석 */
/*
	1. 데이터베이스 : 데이터(자료), 베이스(모임)
		- 자료들의 모임
		- 종류
			1. 계층형 데이터베이스		: 트리형태 
			2. 네트워크형 데이터베이스	: 양방향 형채 
			3. * 관계형 데이터베이스		: 행/열로 구성된 테이블(표) 간의 관계
			4. NoSQL 데이터베이스		: key-value
    
    2. DBMS : 데이터베이스 관리 시스템
		- MYSQL, oradle, access, mysql
	3. DBA : 데이터베이스 관리자
		- DB개발자 
    
		DB[ DBserver ] <--------- DBMS <--------- DBA
			- 학원PC 		- DB 관리 시스템	- SQL(질의어)
			- 데이터를 저장 	- DB 서버에 접속
            - 메모리[16진수]	
            
		예) 
			DBA[표 만들어줘] ---> DBMS[표 만들어줘->기계어] ---> DB[표 만들기 성공]
								메모리1 메모리2					메모리1
                                메모리3 메모리4					메모리2
															메모리3
															메모리4
                                                            
	4. SQL 질의어(암기) - 대소문자 구분 X
		1. DDL : 데이터베이스 정의어
			- create table/database 이름;	: 테이블/데이터베이스 생성
            - drop table/database 이름;		: 테이블/데이터베이스 삭제
            - alter							: 수정
            - truncate						: 테이블/데이터베이스 영구 삭제
        2. DML : 데이터베이스 조작어
			- select						: 데이터 검색 
            - insert						: 데이터 추가
            - update						: 데이터 수정
            - delete						: 데이터 삭제
		3. DCL : 데이터베이스 제어어
			- grant							: 사용자 계정 권한 부여
            - revoke						: 사용자 계정 권한 취소
        4. TCL : 트랜잭션 제어어
			- commit						: 트랜잭션 완료
			- rollback						: 트랜잭션 취소
            
		5. 테이블( 표 : 행(레코드) / 열(필드) )
			* 여러 개의 자료들을 효율적으로 관리하기 위해 관계형 데이터베이스(표) 
				- 필드1(열1 - colum)	- 필드2(열1 - colum)
					아이디				비밀번호
					qwe					qwe				- 레코드1(행1)
					asd					asd				- 레코드2(행2)
					zxc					zxc				- 레코드3(행3)
*/

# 예1 : 데이터베이스(저장소) -> create
create database test;
	# create : 생성하다
	# database : 데이터베이스를
	# test : 데이터베이스 이름(아무거나)
	# ; : 명령어 마침
    # ctrl + Enter : 커서 위치에 있는 ; 단위 명령어 실행
	# 새로고침 : SCHEMAS 옆 아이콘 / F5

create database test2;
create database test3;
create database java;

# 예2 : 데이터베이스 목록 보기 -> show
show databases;

# 예3 : 데이터베이스 사용(선택)하기 -> use / * 데이터베이스가 여러 개 이므로 선택
use test;
use test2;
use test3;
use java;

# 예4 : 데이터베이스 삭제 -> drop
drop database test;
drop database test2;
drop database test3;
drop database java;

# 예5 : 테이블 생성 [ * 데이터베이스 선택해야 함 ]
create database java;	-- 1. 데이터베이스 생성
use java;				-- 2. 데이터베이스 선택
create table member(	-- 3. 선택된 데이터베이스의 표 만들기
    아이디 text,
    비밀번호 text
);
# create : 생성핟	 | table : 테이블 | memver : 테이블명
# create table 테이블명(필드명 타입 제약조건, 필드명 타입 제약조건);
create table member2(아이디 text, 비밀번호 text);
create table member3(아이디 text, 비밀번호 text);

# 예6 : 테이블 검색
select * from member;
# select : 검색(선택)	| * : 와일드 카드 | from 테이블명
# select 필드명 from 테이블명;
select * from member2;
select * from member3;