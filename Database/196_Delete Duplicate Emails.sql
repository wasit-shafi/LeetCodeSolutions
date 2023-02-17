# referred solutions tab
delete p1
from person as p1,
     person p2
where p1.email = p2.email
  and p1.id > p2.id;

# referred form discussion tab
# delete
# from person
# where id not in (select min_id from (select min(id) as min_id from person group by email) as dummy_table)
