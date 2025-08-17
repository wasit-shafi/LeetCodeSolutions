-- Referred https://www.youtube.com/watch?v=3exsohwz_LY , My SQL Query
select
  round(
    count(distinct player_id) / (
      select
        count(distinct player_id)
      from
        activity
    ),
    2
  ) as fraction
from
  activity
where
  (player_id, date_sub(event_date, INTERVAL 1 day)) in (
    select
      player_id,
      min(event_date) as first_login
    from
      activity
    group by
      player_id
  );

-- CTM: date_sub() is not supported in Postgresql
-- NOTE: I tried below Postgresql query, but only 6 / 15 testcases passed , not sure why is not passing all the testcases
-- with
--   tempCTE as (
--     select
--       a1.player_id
--     from
--       activity a1
--       join activity a2 on a1.player_id = a2.player_id
--       and a1.event_date + 1 = a2.event_date
--   )
-- select
--   round(
--      count(distinct(player_id))
--     / (
--       select
--         count(distinct(player_id))
--       from
--         activity
--     )::decimal,
--     2
--   ) as fraction
-- from
--   tempCTE;