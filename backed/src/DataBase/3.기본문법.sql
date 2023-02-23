/*
	SQL
		create
			create database DB명;
            create table table명();
        drop
			1. DB
			drop database DB명;
            drop database if exists DB명;
            2. TABLE
			drop table table명();
            drop table if exists DB명;
             
	DML
    DCL
    
    - 타입( DBMS 회사마다 다름 )
		1. 정수형	
			- tintint
            - smallint 	: +-3만
            - int		: +-20억
            - bigint
		2. 문자형
			- char(고정길이)
            - varchar(가변길이)
		3. 대용량
			- text
            - longtext
		4. 실수형
			- float
            double
		5. 날짜형
			- date
            - time
            - datetime
    - 제약조건
		* primary key : 식별키(기본키) ( 필드 내 중복X, 공백X )
        * foreign key : 외래키 ( pk와 연결된 필드 )
						-> 해당 pk의 필드
    
		1. not null : 공백 불가 ( 만약 공백이면 저장 실패 )
        2. auto_increment : 레코드 추가시 자동 번호 부여 ( 무조건 pk 필드만 가능 )
*/
# drop database market; -- 빨간원(X)

-- 1. DB 생성
drop database if exists market; -- 노란세모(!)
create database market;
use market;

-- 2. 테이블 생성
drop table if exists member; -- 노란세모(!)
create table member( #만약에 존재하면 삭제하겠다
	# 필드 선언
		-- 필드명 : (주로) 테이블 앞 글자_필드명
	m_id char(8) not null primary key,
    m_name varchar(10) not null,
    m_num int not null,
    m_addr char(2) not null,
    m_phone1 char(3), #국번
    m_phone2 char(8), #전화번호
    m_height smallint,
    m_debut date
);
select * from member;

INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');
select * from member;

# 테이블 추가 생성 ---------------------------------------------------
drop table if exists buy;
create table buy(
	b_num int auto_increment primary key,	# 구매번호
    m_id char(8),							# 구매한 회원
    b_pname char(6) not null,				# 제품명
	b_gname char(4),						# 제품 분류명
    b_proce int not null,					# 제품 가격
    b_amout smallint not null,				# 제품 수량
    foreign key(m_id) references member(m_id)
    -- 외래키 설정 필드 ( 현재 테이블의 필드명 ) 참조하다 PK를 위한 테이블명 ( PK필드명 )
);
select * from buy;

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);
select * from buy;

-- select : 검색
-- 1. select 필드명 from 테이블명
select m_id from member;
select m_id, m_name from member;
-- 2. select * from 테이블명
	-- *(와일드카드) : 모든 것을 의미함
select * from member; #모든 필드
-- 3. select 필드명 as '별칭' from 테이블명
select m_id as '회원아이디' from member;
-- 4. select 필드명 from 테이블명 where 조건
select * from member where m_name = '블랙핑크';
select * from member where m_num = '4';

select * from member where m_height <= 162;
select * from member where m_height >= 165 and m_num > 6;
select * from member where m_height >= 165 or m_num > 6;
select * from member where m_height >= 163 and m_height <= 165;
-- => between
select * from member where m_height between 163 and 165;

select * from member where m_addr = '경기' or m_addr = '전남' or m_addr = '경남';
-- => in
select * from member where m_addr in('경기','전남','경남');

select * from member where m_name = '우주소녀';
select * from member where m_name like '우%'; -- '우'로 시작하는 문자 찾기
select * from member where m_name like '%우'; -- '우'로 끝나는 문자 찾기
select * from member where m_name like '%우%'; -- '우'가 포함된 문자 찾기
select * from member where m_name like '우_'; -- '우'로 시작하는 두 글자 찾기
select * from member where m_name like '__우'; -- '우'로 끝나는 세 글자 찾기
select * from member where m_name like '_우_'; -- 세 글자 중 가운데 글자가 '우'인 문자 찾기

select m_num, m_num+1, m_num-1, m_num*2, m_num/2, m_num div 2, m_num mod 2 from member;
select m_num * m_height 멤버키점수 from member;

-- 5. select * from 테미블명 order by 정렬기준필드
select * from member order by m_debut asc; -- 오름차순 ( asc 생략 가능 )
select * from member order by m_debut desc; -- 내림차순 ( !! desc 생략 XXX )
select * from member order by m_height desc;
select * from member where m_height >= 160 order by m_height desc;
-- => select * from 테이블명 where 조건 order by 정렬기준;
select * from member m_height order by m_height desc, m_debut asc;
-- => 만약에 키를 내림차순으로 정렬 후 동일한 키가 있을 경우 동일한 키 중에서 데뷔날짜를 오름차순으로 정렬함



-- ER 다이어그램 ( 테이블 간 관계 확인 )
	-- 메뉴 -> Datebase -> reverse Engineer