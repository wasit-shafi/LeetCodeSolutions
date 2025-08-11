select
  p.product_id,
  COALESCE(
    round(sum(p.price * u.units) / sum(u.units)::Decimal, 2),
    0
  ) as average_price
from
  prices p
  left join unitsSold u on p.product_id = u.product_id
  and u.purchase_date >= p.start_date
  and u.purchase_date <= p.end_date
group by
  p.product_id;