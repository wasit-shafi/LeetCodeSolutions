/* Below query will not work as we can't use DISTINCT with only for 1 column for more info refer :  https://stackoverflow.com/questions/23113684/distinct-not-working-with-other-columns*/

/* select
 distinct user_id,
 time_stamp
 from logins
 where time_stamp like '2020%'; */

/*METHOD 1:  using like operator */

/* select
 user_id,
 max(time_stamp) as 'last_stamp'
 from logins
 where time_stamp like '2020%'
 group by user_id; */

/*METHOD 2:  using year() function */

select
    user_id,
    max(time_stamp) as 'last_stamp'
from logins
where year(time_stamp) = 2020
group by user_id;