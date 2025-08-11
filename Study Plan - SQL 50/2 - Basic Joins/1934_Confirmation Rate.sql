--  Ref: https://www.youtube.com/watch?v=VgpN3Eh3Yg8
select
  s.user_id,
  ifnull (
    round(sum(action = 'confirmed') / count(*), 2),
    0.00
  ) as confirmation_rate
from
  signups s
  left join confirmations c on s.user_id = c.user_id
group by
  s.user_id;