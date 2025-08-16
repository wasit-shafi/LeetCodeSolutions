-- Referred https://www.youtube.com/watch?v=I-38YxAIwK0

select
  round(
    (
      sum(
        case
          when order_date = customer_pref_delivery_date then 1
        end
      ) * 100 / count(*)
    ::decimal)::decimal,
    2
  ) as immediate_percentage
from
  delivery
where
  (customer_id, order_date) in (
    select
      customer_id,
      min(order_date) as first_order_date
    from
      delivery
    group by
      customer_id
  );