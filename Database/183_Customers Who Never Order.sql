/* METHOD 1 : using sub-query */

select name as "Customers"
from customers
where customers.id not in (
        select
            distinct customerId
        from orders
    );

/* METHOD 2 : using left join */

/* select name as "Customers"
 from customers
 left join orders on customers.id = orders.customerId
 where
 orders.customerId is null; */