-- Ref: https://leetcode.com/problems/last-person-to-fit-in-the-bus/solutions/4828266/sql-solution-beats-100-easy-to-understan-z1i0
select
  person_name
from
  (
    select
      turn,
      person_id,
      person_name,
      weight,
      sum(weight) over (
        order by
          turn
      ) as total_weight
    from
      queue
  ) queue1
where
  total_weight <= 1000
order by
  turn desc
limit
  1;