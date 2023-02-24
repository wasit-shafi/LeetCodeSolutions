select
    p.product_id,
    p.product_name
from product as p
where p.product_id in (
        select product_id
        from sales
        group by product_id
        having
            min(sale_date) >= '2019-01-01'
            and max(sale_date) <= '2019-03-31'
    );