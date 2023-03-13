/* COALESCE() return first non- null value */

/* select
    name,
    COALESCE(R.travelled_distance, 0) as 'travelled_distance'
from users
    left join (
        select
            user_id,
            sum(distance) as 'travelled_distance'
        from Rides
        group by
            user_id
    ) as R on id = R.user_id
order by
    travelled_distance desc,
    name asc; */

/* METHOD2 : using if() and isnull() instead of coalesce() */

select
    name,
    if(
        isnull(R.travelled_distance),
        0,
        R.travelled_distance
    ) as 'travelled_distance'
from users
    left join (
        select
            user_id,
            sum(distance) as 'travelled_distance'
        from Rides
        group by
            user_id
    ) as R on id = R.user_id
order by
    travelled_distance desc,
    name asc;