# Write your MySQL query statement below
select e.name from Employee e join Employee b on e.id = b.managerid
 group by b.managerid having
count(b.managerid) >=5;