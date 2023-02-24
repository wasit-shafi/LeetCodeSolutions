/* Method 1 using sub-query and join */
/* select u.name, T.balance
from users as u
    join (
        select
            account,
            sum(amount) as balance
        from transactions
        group by account
        having
            balance > 10000
    ) as T on u.account = T.account; */

/* Method 2 : without using sub-query */
select
    u.name,
    sum(amount) as balance
from users as u
    join transactions as t on u.account = t.account
group by T.account
having balance > 10000;