/*
		개발자(DBA)			DBMS				  컴퓨터
	  (언어)영어,한글								기계어(0,1)
	
	    표 만들어줘		  기계어로 번역	 --------->	 메모리 할당
    creat table 회원();

	1. SQL 질의어(대표 12개)
		1.1 DDL
			- create(생ㅅㅇ)
				: create database DB명; 										
                : create table 테이블명(필드명 타입 제약조건, 필드명 타입 제약조건);		
            - drop
				: drop database DB명;	
                : drop table 테이블명(); 	
            - alter
            - truncate
        1.2 DML
			- insert
				모든 필드 : insert into 테이블명 values(데이터1, 데이터2);
                특정 필드 : insert into 테이블명(필드명1, 필드명2) values(데이터1, 데이터2);
            - select
				모든 테이블 : select * from 데이블명;
                특정 테이블 : select 필드명, 필드명 from 테이블명;
                테이블 검색 : select * from 테이블명 where
            - update	
				모든 레코드 수정 : update 테이블명 set 필드명 = 새로운값
                특정 레코드 수정 : update 테이블명 set 필드명 = 새로운값 where 조건
            - delete
				모든 레코드 삭제 : delete from 테이블명
                특정 레코드 삭제 : delete from 테이블명 where 조건
        1-3. DCL
			- grant
            - revoke
        1-4. TCL
			- commit
            - rollback
        1-5. 그 외
			- use DB명; // DB 사용
		
        2. 데이터 타입
			2.1 정수형 : TINYINT, SMALLINT, INT, BIGINT
            2.2 실수형 : FLOAT, DOUBLE
            2.3 문자형 : CHAR(길이:고정), VARCHAR(길이:가변)
            2.4 날짜형 : DATE, TIME, DATETIME
            2.5 대용량 : TEXT, LONGTEXT, BLOB, LONGBLOB

*/

drop database java;
-- 1. DB생성
create database java;
-- 2. DB 사용
use java;
-- 3. 테이블생성
create table member(
		mno int auto_increment primary key,
				-- auto_increment : 자동번호 부여( * pk 같이 사용 )
                -- primary key	 : 식별용도( 중복 X, null X )
        mid varchar(20),
        mpw varchar(20),
        mname varchar(10),
        mphone varchar(13) 
        );
-- 4. 회원가입 1명
insert into member(mid, mpw, mname, mphone) values('qwe', 'qwe', '유재석', '010-1234-5678');
-- 5. 테이블 확인
select * from member;
-- 6. 회원가입 추가
insert into member(mid, mpw, mname, mphone) values('asd', 'asd', '강호동', '010-9876-5432');
-- 7. 로그인하기 : 아이디와 비밀번호가 일치한가 
				# 조건 where절 
					-- 필드명 연산자 값 and(이면서) 필드명 연산자 값 ( ture, false )
                    -- 필드명 연산자 값 or(또는) 필드명 연산자 값 ( ture, false )
select * from member where mid = 'asd' and mpw = 'zxc'; -- 검색된 레코드가 존재하면 로그인 성공 없으면 로그인 실패
-- 8. 로그인하기 : 아이디와 비밀번호가 일치한가 
				# 조건 where 필드명 = 값 and(이면서) 필드명 = 값
select * from member where mid = 'qwe' and mpw = 'qwe'; -- 검색된 레코드가 존재하면 로그인 성공 없으면 로그인 실패
-- 9. 특정 회원의 모든 정보를 호출
select * from member where mno = 3; -- 3번 회원의 레코드 존재하지 않음
select * from member where mno = 2; -- 2번 회원의 레코드 존재함
-- 10. 특정 회원의 비밀번호 변경(2번회원 비밀번호 -> 'zxc')
update member set mpw = 'zxc'; -- 모든 회원의 비밀번호 변경
update member set mpw = 'zxc' where mno = 2; -- mno가 2번인 레코드의 비밀번호만 변경
-- 11. 특정 회원 탈퇴
delete from member; -- 모든 회원 탈퇴
delete from member where mno = 2; -- mno가 2번인 레코드 삭제







