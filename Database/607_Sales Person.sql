select s.name
from SalesPerson as s
where s.sales_id not in (
        select
            distinct o.sales_id
        from Orders as o
        where o.com_id = (
                select
                    c.com_id
                from
                    company as c
                where
                    name = 'RED'
            )
    );