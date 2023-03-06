/* Methd 1: using CTE and Exists() */

/* with cte(ConsecutiveNums) as (
        select
            distinct (
                case
                    when (
                        Exists(
                            select
                                *
                            from
                                logs as l2
                            where
                                l2.num = l1.num
                                and l2.id = l1.id + 1
                        )
                        and Exists(
                            select
                                *
                            from
                                logs as l2
                            where
                                l2.num = l1.num
                                and l2.id = l1.id + 2
                        )
                    ) then num
                end
            )
        from logs as l1
    )
select ConsecutiveNums
from cte
where
    ConsecutiveNums is not null; */

/* Method 2: using join */

select
    distinct l1.num as ConsecutiveNums
from
    logs as l1,
    logs as l2,
    logs as l3
where
    l1.num = l2.num
    and l1.id + 1 = l2.id
    and l2.num = l3.num
    and l2.id + 1 = l3.id;

/* Method 3: by direct search the (id+1, num) and (id+2, num) in the whole table */

/* for more info refer: https://leetcode.com/problems/consecutive-numbers/solutions/321205/runtime-299-ms-faster-than-94-39/?orderBy=most_votes */

/* select
    distinct num as ConsecutiveNums
from logs
where (id + 1, num) in (
        select *
        from
            logs
    )
    and (id + 2, num) in (
        select *
        from logs
    ) */