/*
	메모리
		주기억장치 :  RAM	휘발성	전기O저장O	- 현재 실행중인 명령어 저장
			- JVM , 게임중 , 
        보조기억장치 : ROM 비휘발성	전기X저장O	- 모든 명령어 저장
			- DB , 파일 , C드라이브 , CD , USB , 게임설치 등
            
	데이터베이스
		1. 데이터[자료] 베이스[모임 ] -> 표 -> 관계형[열/행] 데이터베이스 
		2. [워드,엑셀,한글] 마우스 표 제작 vs [데이터베이스] 대화식[명령어] 표 제작 
        3. SQL 질의어 
	
    표 제작 
    
*/
-- 1. DB생성 / 선택
drop database if exists 회원;
create database 관계테이블연습;
use 관계테이블연습;

drop table if exists 회원;
create table 회원( 회원번호 int primary key, 아이디 varchar(20), 비밀번호 varchar(10) );

drop table if exists 제품;
create table 제품( 제품번호 int primary key, 제품이름 varchar(20), 제품가격 int);

drop table if exists 구매내역;
create table 구매내역( 
	구매번호 int primary key,
    구매일자 datetime,
    회원번호_fk int,
    제품번호_fk int,
    foreign key( 회원번호_fk ) references 회원( 회원번호 ),
    foreign key( 제품번호_fk ) references 제품( 제품번호 )
);

# 1.
drop table if exists category;
create table category( con int auto_increment primary key, cname varchar(10) not null unique );

drop table if exists product;
create table product(
	pno int auto_increment primary key,
    pname varchar(10) not null unique,
    pcomment text not null,
    pprice smallint not null,
    cno_fk int,
    foreign key( cno_fk ) references category( cno ) on delete cascade on update cascade -- pk삭제
);

drop table if exists porder;
create table porder(
	pono int auto_increment primary key,
    podate datetime default now(),
    postate tinyint default 1,
    pno_fk int,
    foreign key( cno_fk ) references category( cno ) on delete set null on update set null
);

insert into category( cname ) values( '콜드브루' );
insert into category( cname ) values( '커피' );
select * from category;

insert into product( pname, pcomment, pprice, cno_fk ) values('콜드브루라떼' , '맛있는~~' , 3000 , 1 );
insert into product ( pname , pcomment , pprice , cno_fk ) values( '오곡콜드브루' , '맛있는~~' , 4500 , 1 );
insert into product ( pname , pcomment , pprice , cno_fk ) values( '꿀커피' , '맛있는~~' , 2000 , 2 );
select * from product;

insert into porder ( pno_fk ) values( 2 );	-- 오곡콜드브루 주문	
insert into porder ( pno_fk ) values( 3 );	-- 꿀커피 주문 		 
insert into porder ( pno_fk ) values( 2 );	-- 오곡콜드브루 주문	
select * from porder;





