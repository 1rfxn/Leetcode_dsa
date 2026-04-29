# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary
from department d join employee e
on d.id = e.departmentid
where e.salary = (
    select max(salary)
    from employee
    where departmentid = e.departmentid
);
