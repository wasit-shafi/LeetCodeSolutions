/* Method 1 : using addDate() */

select w1.id
from weather as w1
    join weather as w2 on w1.temperature > w2.temperature and w1.recordDate = addDate(w2.recordDate, interval 1 day);

/* Method 2 : using subDate() */

select w1.id
from weather as w1
    join weather as w2 on w1.temperature > w2.temperature and subDate(w1.recordDate, interval 1 day) = w2.recordDate;