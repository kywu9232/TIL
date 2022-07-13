-- 기본
select last_name 이름 , salary*12 '월급의 12배' from employees
where salary*12 >= 170000;

select last_name, salary from employees
where department_id = null;

select last_name, salary, hire_date from employees
where hire_date < '2004-01-01 00:00:00';

select department_id,department_name from departments;

select job_id, job_title from jobs;

-- 논리연산자
select last_name, salary, department_id from employees
where department_id in (80,50)
and salary >=13000;

select last_name, salary, department_id, hire_date from employees
where hire_date >= '2005-01-01'
and salary >=13000 and salary <=20000;

-- sql 비교 연산자

select last_name, salary, department_id, hire_date from employees
where hire_date between  '2005-01-01' and '2006-01-01';

select last_name,salary,department_id from employees
where job_id like '%clerk%';

select last_name,salary,hire_date from employees
where hire_date like '____-12%';

select last_name,salary,hire_date from employees
where last_name like '%le%';

select last_name,salary,hire_date from employees
where last_name like '%m';

select last_name,salary,hire_date from employees
where last_name like '__d%';

select last_name,commission_pct,salary from employees
where commission_pct is not null;

select last_name,ifnull(commission_pct,0),salary from employees
where commission_pct is null;

select last_name , hire_date, salary , commission_pct from employees
where salary between 5000 and 17000
and commission_pct is not null
order by hire_date asc , salary desc;




-- 함수
select last_name, first_name,ifnull (manager_id,BOSS) from employees;


select concat(employee_id,' 번 사번의 사원 명은 ' , first_name,',' ,last_name, 
' 이고 입사월은 ', hire_date, '입니다') 사원정보 from employees;


select * from departments;
select location_id, city from locations;
select country_id, country_name from countries;
select job_id, job_title from jobs;