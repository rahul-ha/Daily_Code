# Write your MySQL query statement below
select unique_id , name from employees e left join EmployeeUNI as Ei
on e.id  = Ei.id;
