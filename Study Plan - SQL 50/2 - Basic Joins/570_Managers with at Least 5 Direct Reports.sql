select
  e2.name
from
  employee as e1
  join employee as e2 on e1.managerId = e2.id
group by
  e2.name,
  e2.id
having
  count(*) >= 5;