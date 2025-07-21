select
  employeeUNI.unique_id,
  employees.name
from
  employees
  left join employeeUNI on employees.id = employeeUNI.id;