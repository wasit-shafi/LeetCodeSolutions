select T.employee_id
from (
        select employee_id
        from employees
        where
            employee_id not in (
                select
                    employee_id
                from
                    salaries
            )
        union
        select employee_id
        from salaries
        where
            employee_id not in (
                select
                    employee_id
                from
                    employees
            )
    ) as T
order by T.employee_id;