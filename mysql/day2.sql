select user();
use empdb;
select database();

select * from employees;
-- 모든 사원 총합
select sum(salary) from employees;
select sum(salary), avg(salary), count(salary) from employees;

-- 문자 사전 순서 앞 - 작다, 뒤 - 크다
select max(first_name), min(first_name), count(first_name) from employees;

-- count(컬럼명 -- 컬럼 not null 갯수
select count(hire_date), count(department_id), count(commission_pct), count(*) from employees;

select first_name, department_id from employees
where department_id is null;

select first_name, commission_pct from employees
where commission_pct is null;

-- 집계함수 결과 1개. select 절 다른 컬럼 같이 조회 x
select salary, sum(salary) from employees; --
select salary from employees;

-- 
select first_name, department_id, salary from employees;
select sum(salary) from employees
where department_id = 90;

-- 각 부서별 급여 총합 조회
select department_id,sum(salary) from employees
group by department_id;

-- 각부서별 급여 총합 조회하되 급여 총합이 100000이상인 결과만 조회
-- where 절에는 집게함수 조건 불가(group by 이전 where 실행 불가)
-- having절 집계함수 조건식
select department_id,sum(salary) from employees
group by department_id
having sum(salary) >= 100000;
-- from - where - group by - having - select - orderby

-- job_id 직종코드(문자
-- 직종별로 사원의 급여 평균을 구하되 it_prog 직종은 제외하고 조회
-- 조회 컬럼은 직종코드, 부서평균 급여 조회
-- 부서평균 급여가 많은 직종부터 보여주도록 조회
select job_id , avg(salary) from employees
where job_id !='it_prog'
group by job_id 
order by avg(salary) desc;

-- 2006년 이후 입사 사원에 대해 부서별, 보너스 평균 상환
-- 보너스 = salary + salary*commission_pct
-- 보너스는 받지 못하는 사원제외, 소속부서 없는 사원 제외
select hire_date from employees;
select department_id, avg(salary + salary*commission_pct) from employees
where hire_date >= '2006-01-01 00:00:00'
and commission_pct is not null
and department_id is not null
group by department_id;

--
create table emp_copy (select employee_id, first_name, last_name, salary, hire_date from employees);
select count(*) from emp_copy;
select count(*) from employees;

describe emp_copy;

-- 1, 이사원, 15000, '2000-12-10 00:00:00'
insert into emp_copy values(1, '사원', '이', 15000, '2000-12-10 00:00:00');
insert into emp_copy values(2, '길동', '홍', 25000, '2022-12-10 ');
insert into emp_copy values(3, '대리', '홍', 26000, now());
insert into emp_copy values(4, '신입', '홍', 10000, current_date());

-- 나열되지 않는 컬럼 자동 null
insert into emp_copy(employee_id, hire_date, last_name) values(5, now(), '김');
-- 명시 null
insert into emp_copy values(6, null, '박', null, now());

-- delete from emp_copy; -- emp_copy 모든 레코드 삭제 (테이블 구조는 남음)
delete from emp_copy where employee_id =6;

-- update/ delete -- 시간경과 데이터 쌓임
-- 백엄(export) / 복원 (import = restore)

insert ignore into emp_copy values(6,'부장','심',50000,'2020');
insert into emp_copy values(6,'부장','심',50000,now());
-- employee_id 컬럼 정의시 (create table) unique
-- employee_id int(5) unique 전제조건
insert into emp_copy values(6,'부장','심',50000,now())
on duplicate key update hire_date = now();
select * from emp_copy where employee_id <= 10;

select * from emp_copy
order by salary desc
limit 10;

select * from emp_copy where first_name = '부장'order by 1 desc;
update emp_copy set salary = salary + salary*0.2
where first_name = '부장'
limit 2;
select * from emp_copy where employee_id <= 10;




select * from departments;
select location_id, city from locations;
select country_id, country_name from countries;
select job_id, job_title from jobs;

