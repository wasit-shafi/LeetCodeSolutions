/* Method 1: using sub-query */

select
    Max(salary) 'SecondHighestSalary'
from employee
where salary < (
        select Max(salary)
        from employee
    );

/* Method 2 : using exixts() and limit */

/* select
    case
        when Exists( (
                select salary
                from employee
                where
                    salary < (
                        select
                            Max(salary)
                        from
                            employee
                    )
                order by
                    salary desc
                limit
                    1
            )
        ) then (
            select salary
            from employee
            where salary < (
                    select
                        Max(salary)
                    from
                        employee
                )
            order by
                salary desc
            limit
                1
        )
        else null
    end as 'SecondHighestSalary'; */