select
    T.sell_date,
    count(*) as num_sold,
    group_concat(
        T.product
        order by
            T.product
    ) as products
from (
        select
            distinct sell_date,
            product
        from activities
    ) as T
group by sell_date
order by sell_date;