with
  tempCTE as (
    select distinct
      product_id,
      (
        select
          max(change_date)
        from
          products
        where
          product_id = p.product_id
          and change_date <= '2019-08-16'
      ) as max_change_date
    from
      products p
  )
select
  tempCTE.product_id,
  COALESCE(p.new_price, 10) as price
from
  tempCTE
  left join products p on tempCTE.product_id = p.product_id
  and tempCTE.max_change_date = p.change_date;