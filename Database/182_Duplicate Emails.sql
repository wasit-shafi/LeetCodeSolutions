# Method 1 : using where clause
# select distinct p1.email
# from person as p1,
#      person as p2
# where p1.id <> p2.id
#   and p1.email = p2.email;

#METHOD 2 : USING GROUP BY & HAVING
select email
from person
group by email
having count(email) > 1;