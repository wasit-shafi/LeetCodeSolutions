-- Method 1 : using only exists()
-- select
--   s.id,
--   s.visit_date,
--   s.people
-- from
--   stadium as s
-- where
--   s.people > 99
--   and (
--     (
--       -- start
--       exists(
--         select
--           s1.id
--         from
--           stadium as s1
--         where
--           s1.id = s.id + 1
--           and s1.people > 99
--       )
--       and exists (
--         select
--           s1.id
--         from
--           stadium as s1
--         where
--           s1.id = s.id + 2
--           and s1.people > 99
--       )
--     )
--     or (
--       -- middle
--       exists(
--         select
--           s1.id
--         from
--           stadium as s1
--         where
--           s1.id = s.id - 1
--           and s1.people > 99
--       )
--       and exists (
--         select
--           s1.id
--         from
--           stadium as s1
--         where
--           s1.id = s.id + 1
--           and s1.people > 99
--       )
--     )
--     or (
--       -- end
--       exists(
--         select
--           s1.id
--         from
--           stadium as s1
--         where
--           s1.id = s.id - 1
--           and s1.people > 99
--       )
--       and exists (
--         select
--           s1.id
--         from
--           stadium as s1
--         where
--           s1.id = s.id - 2
--           and s1.people > 99
--       )
--     )
--   );
-- Method 2 : using CTE, lead() & lag();
with cte as (
  select
    stadium.*,
    lead(people, 1, 0) over(
      order by
        id
    ) as people_lead_one,
    lead(people, 2, 0) over(
      order by
        id
    ) as people_lead_two,
    lag(people, 1, 0) over(
      order by
        id
    ) as people_lag_one,
    lag(people, 2, 0) over(
      order by
        id
    ) as people_lag_two
  from
    stadium
)
select
  id,
  visit_date,
  people
from
  cte
where
  people > 99
  and(
    (
      people_lag_one > 99
      and people_lag_two > 99
    )
    or (
      people_lead_one > 99
      and people_lead_two > 99
    )
    or (
      people_lag_one > 99
      and people_lead_one > 99
    )
  );