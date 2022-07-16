select first_name, department_name
from employees inner join departments 
on employees.department_id = departments.department_id;

-- 테이블 alias 사용권고
select e.first_name, e.department_name,d.department_name
from employees e inner join departments d
on e.department_id = d.department_id;

-- 부서 이름별 급여 총합
select d.department_name 부서이름, d.department_id 부서코드, sum(e.salary)
from employees e inner join departments d
on e.department_id = d.department_id
group by d.department_name
having sum(e.salary)>=100000
order by 부서이름;

--  급여 총합
select e.department_id 부서코드, sum(e.salary)
from employees e
group by e.department_id 
having sum(e.salary)>=100000
order by 부서코드;

-- 테이블 3개 join
select e.first_name,l.city, c.country_name from employees e inner join departments d on e.department_id=d.department_id
inner join locations l on d.location_id = l.location_id
inner join countries c on l.country_id = c.country_id;

select d.department_id, e.first_name,l.city,d.department_name, c.country_name from employees e 
inner join departments d on e.department_id=d.department_id
inner join locations l on d.location_id = l.location_id
inner join countries c on l.country_id = c.country_id
where d.department_id in (100,80,50)
and e.salary >= 5000;

-- outer join
select first_name,e.department_id, department_name
from employees e left outer join departments d
on e.department_id = d.department_id
order by first_name;

select first_name,e.department_id, department_name
from employees e right outer join departments d
on e.department_id = d.department_id
order by first_name;

-- 사원들의 부서명 조회하되 부서 소속되지 않는 사원 부서코드 '-', 부서명 '소속부서없음'출력
select first_name, ifnull(e.department_id,'-') 부서코드, ifnull(department_name,'소속부서없음') 부서명
from employees e left outer join departments d
on e.department_id = d.department_id
order by first_name;

-- self join -- employees 테이블에 존재. manager_id 사번들은 모두 employee_id에 있다
select employee_id,first_name, manager_id
from employees
where first_name like'ke%';

select employee_id,first_name
from employees
where employee_id = 122;

-- 사원명 상사명
select me.first_name 사원명, me.manager_id, manager.employee_id, manager.first_name 상사명
from employees me inner join employees manager on manager.manager_id = man.employee_id;

select employee_id, first_name from employees where manager_id is null;

-- union, union all, not in

-- emp_dept_50 테이블로 정의, 데이터 복사 한번
create table emp_dept_50
(select * from employees where department_id=50);

create table emp_job_man
(select * from employees where job_id like'%man%');
select * from emp_job_man;


select employee_id,first_name, job_id, department_id
from emp_dept_50
union
select employee_id,first_name, job_id, department_id
from emp_job_man;

select employee_id,first_name, job_id, department_id
from emp_dept_50
union all
select employee_id,first_name, job_id, department_id
from emp_job_man;

-- join query 2개이상의 테이블에 나누어졌을 때 컬럼 합침
-- union 2개 이상의 테이블에 나누어졌을 떄 레코드 합침
-- sub query
-- employees 테이블에서 이름이 kelly와 같은 부서 근무 사원의 이름 근무 부서 코드 조회
select department_id from employees where first_name = 'kelly';

select first_name 이름, department_id 근무부서코드
from employees
where department_id =(select department_id from employees where first_name='kelly');


select first_name 이름, department_id 근무부서코드
from employees
where department_id in(select department_id from employees where first_name='peter');
select job_id,department_id from employees where first_name = 'peter'; -- 1명

-- union / union all / in / not in
-- shubquery 사용 where 절 조건 단일행  subquery '=' / 다중행 subquery = in

-- join 각 2개 테이블에서 컬럼 합침



