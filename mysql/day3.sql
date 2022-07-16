-- 7장
set @var1 ='문자열';
set @var2 = 100;
set @var3 = 10/3;
set @var4 = '2002-12-12 00:00:00';

select @var1,@var2,@var3,@var4;
select hire_date,first_name from employees
where hire_date = @var4;

-- 10의 행 - 결과 10개 리턴

-- 형변환 - cast, convert, format, date_format
select 10,cast(10 as decimal(10,5)), convert(10, decimal(10,5)), format(10,5);
select avg(salary), cast(avg(salary) as signed integer),convert(avg(salary),signed integer),
format(avg(salary),0) from employees;

-- date : 4자리 연도 - 2자리 월 - 2자리 일 select
select cast('2022$07$14' as date);
select cast('2022$07$14' as time);
select cast('2022:09:11 12:23:45' as time);
select cast('20221212' as date);

-- 오류 select cast(hire_date as year) from employees;
-- 자동 형변환 = 암시적 형변환 ('문자열'-> '4자리-자리-자리숫자' -> 자동날짜)
-- '문자열' -> "숫자구성", "숫자와 . 구성"
select '8818.5678'+1;
select "100"+"200";
select "100가나다"+"200가나다"; -- 100 + 0
select 0 = 0; -- 같으면 1, 다르면 0
select 0 = "musql0";
select concat("100","200"); -- 100200

-- 조건 - ifnull, nullif, if, case
-- ifnull(데이터, 변환값) - 리턴 결과 2개중 하나 null이면 변환값, not null이면 원래값
select commission_pct,ifnull(commission_pct,'보너스없음') from employees; 
-- nullif(데이터1, 데이터2) - 리턴 결과 데이터1과 데이터2 동일하면 null 리턴, 다르면 데이터1 리턴
select nullif(100,100), nullif(100,200);
-- if(조건, 참결과, 거짓결과)
select if(10>0, "크다", "작거나 같다");
-- 사원들 보너스 받는 직원, 받지 못하는 직원
select first_name ,if(first_name is null, '받는다', '못받는다')
from employees;

-- 급여 15000이상 임원, 10000이상 부장, 5000이상 과장, 나머지 대리 사원
select first_name 이름, salary 급여 ,
if(salary>=15000, '임원', 
if(salary >=10000, '부장', 
if(salary >=5000, '과장', '대리나 사원'))) 직급
from employees
order by 급여 desc;

-- case 문법 문장
set @casevar = 10;
select case @casevar when 1 then '1이다'
when 10 then '10이다'
when 100 then '100이다'
else '모른다'
end;

select first_name 사원명, salary 급여,
case 
when salary >= 15000 then '임원'
when salary >= 10000 then '부장'
when salary >= 5000 then '과장'
else '대리나 사원'
end 직급 from employees;

-- 문자
select ascii('a'), char(65);
set @charvar1 = "java";
set @charvar2 = "자바";

select bit_length(@charvar1), length(@charvar1), char_length(@charvar1),
bit_length(@charvar2), length(@charvar2), char_length(@charvar2);

-- 사원테이블에서 3글자 이름인 사원만 출력
select first_name from employees where char_length(first_name) =3;

-- concat 두개 문자열 합침
select concat('a','b','cc'), concat_ws(':','b','cc');

-- 문자열 검색
select elt(2,'일','둘','3'); -- 2번째 문자
select substring("일이삼사",1,2); -- 1번부터 2개문자
select field('둘','일','둘','3'); -- '둘' 문자 인덱스 (1~)
select find_in_set('이','일,이,삼,사'); -- 2
select instr("일이삼사","이"); -- 2
select locate("삼사","일이삼사"); -- 3

-- employees 테이블에서 2006년 입사자 찾기
select hire_date from employees where hire_date like'2006%';
select hire_date from employees where hire_date >= '2006-01-01' and hire_date <='2006-12-31';
select hire_date from employees where instr(hire_date,'2006') =1;
select hire_date from employees where substr(hire_date,1,4)='2006';

-- 2006년 6월 입사자 찾기
select hire_date from employees where instr(hire_date,'-06') =5;
select hire_date from employees where substr(hire_date,6,2) = '06';

-- format (숫자 소수점 이하 ',' - 문자데이터 변환 기능 유사)
select 123456.7890 , format(123456.7890,0);

select format(avg(salary),0) from employees;

-- insert 지정 숫자 갯수만큼 삭제하고 새로 추가
select 'abcdef', insert('abcdef',3,2,'-'); -- 3번 문자부터 2개 삭제 후 - 추가

-- repeat
select repeat('abc',10);

-- 데이터베이스 암호 저장 컬럼 존재
select first_name,phone_number from employees;

select first_name 이름,insert( phone_number,9,4,repeat('*',4)) 폰번호 from employees;

/*  이름 첫문자는 그대로 나머지 * 이름 문자 갯수만큼*/
select insert(first_name,2, char_length(first_name)-1 , repeat('*',char_length(first_name)-1 )) from employees;

select insert('abcdef',3,2,"*"); -- ab*ef
select replace('abcdef',3,"*"); -- 3번 문자부터 *로

-- left right
select left("mysql",3), right("mysql",3);

-- upper , lower(mysql 문자열 알파벳 값 대소문자 구분x, oracle 구분o)

-- 숫자
-- truncate 버림  , round 반올림
select 1234.5678, round(1234.5678,3), truncate (1234.5678,3);
select 1234.5678, round(1234.5678,-3), truncate (1234.5678,-3); -- 10자리 표현
-- mod (나머지 함수)
select mod(100,2);

-- employees 테이블 사번컬럼 값이 홀수이면 홀수사번 출력, 짝수이면 짝수사번'사번의 성격'
select employee_id 사번, if(mod(employee_id,2)=0, "짝수사번", "홀수사번") 사번의성격
from employees;

-- 날짜 - year 함수
-- 현재 날짜와 시각 now(), sysdate(), curdate(), curtime()
select curdate() 오늘날짜, subdate(curdate(), interval 1 day) 어제날짜,
adddate(curdate(), interval 1 day) 내일날짜,
adddate(curdate(), interval 1 month) 한달후날짜,
adddate(curdate(),interval 1 year) '1년후날짜';

-- addtime, subtime
select addtime('2002-12-12 10:00:00','2:00:00');
-- 두 날짜 사이의 날짜 차이
select datediff(now(), '2022-06-30'); -- 14일
select timediff(time(now()), '16:00:00'); -- 시 분 초
-- 두 날짜 사이의 개월 차이
select period_diff('202307','202207');
select hire_date from employees;
select period_diff(now(),hire_date) 입사경과개월수 from employees;

