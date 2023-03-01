with cte_users as (
        select
            u.user_id,
            u.join_date
        from
            users as u
    ),
    cte_orders as (
        select
            buyer_id,
            count(*) as orders_in_2019
        from orders
        where
            year(order_date) = '2019'
        group by buyer_id
    )
select
    cte_users.user_id as buyer_id,
    cte_users.join_date,
    if(
        cte_orders.orders_in_2019 is null,
        0,
        cte_orders.orders_in_2019
    ) as orders_in_2019
from cte_users
    left join cte_orders on cte_users.user_id = cte_orders.buyer_id;