select
  r.contest_id,
  round(
    (
      count(*) / (
        select
          count(*)
        from
          users
      )::decimal * 100
    )::decimal,
    2
  ) as percentage
from
  users u
  join register r on u.user_id = r.user_id
group by
  r.contest_id
order by
  percentage desc,
  r.contest_id asc