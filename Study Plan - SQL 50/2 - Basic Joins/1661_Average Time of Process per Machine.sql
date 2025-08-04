with
  activity_cte as (
    select
      A1.machine_id,
      A1.process_id,
      A1.activity_type,
      ((A2.timestamp - A1.timestamp)) AS process_time
    from
      Activity A1
      join Activity A2 on A1.machine_id = A2.machine_id
      and A1.process_id = A2.process_id
      and A1.activity_type = 'start'
      and A2.activity_type = 'end'
  )
select
  machine_id,
  round(avg(process_time)::Decimal, 3) as processing_time
from
  activity_cte
group by
  machine_id;