/* Referred solutions: https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/solutions/2533481/3-different-solutions-join-not-in-not-exists */

select
    v.customer_id,
    count(v.visit_id) as count_no_trans
from visits v
where visit_id not in(
        select visit_id
        from transactions
    )
group by v.customer_id;