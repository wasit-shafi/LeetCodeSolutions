/* Suggest Read: https://stackoverflow.com/questions/60726887/how-to-use-new-created-column-in-where-column-in-sql */

/*  using Derived table */

/* select
    Department,
    Employee,
    Salary
from (
        select
            d.name as Department,
            e.name as Employee,
            e.salary as Salary,
            rank() over(
                partition by departmentId
                order by
                    salary desc
            ) as Salary_Rank
        from employee as e
            join department as d on d.id = e.departmentId
    ) as T
where salary_Rank = 1; */

/* using CTE */

with CTE1 as (
        select
            d.name as Department,
            e.name as Employee,
            e.salary as Salary,
            rank() over(
                partition by departmentId
                order by
                    salary desc
            ) as Salary_Rank
        from employee as e
            join department as d on d.id = e.departmentId
    )
select
    Department,
    Employee,
    Salary
from CTE1
where Salary_Rank = 1;