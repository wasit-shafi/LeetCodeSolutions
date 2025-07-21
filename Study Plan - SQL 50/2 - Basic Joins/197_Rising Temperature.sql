select
  weather1.id
from
  weather weather1
  join weather weather2 on weather1.temperature > weather2.temperature
  and weather1.recordDate = date_add (weather2.recordDate, '1 day');