with cte1 (department, employee, salary, salary_rank) as (
  select
    departmentId,
    name,
    salary,
    dense_rank() over (
      partition by departmentId
      order by
        salary desc
    )
  from
    employee
)
select
  d.name as department,
  cte1.employee,
  cte1.salary
from
  cte1
  join department as d on d.id = cte1.department
  and cte1.salary_rank < 4;