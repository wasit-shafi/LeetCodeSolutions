/* METHOD 1: using sub - query */

/* select name as "Employee"
 from employee as e1
 where salary > (
 select salary
 from employee as e2
 where
 e1.managerId = e2.id
 ); */

/* METHOD 2 : using simple where clause */

/* select e1.name as "Employee"
 from
 employee as e1,
 employee as e2
 where
 e1.managerId = e2.id
 and e1.salary > e2.salary; */

/* METHOD 3 : using joins */

select e1.name as "Employee"
from employee as e1
    join employee as e2 on e1.managerId = e2.id and e1.salary > e2.salary;