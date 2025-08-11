select
  query_name,
  round(sum(rating / position::decimal) / count(*)::decimal, 2) as quality,
  round(
    count(
      case
        when rating < 3 then 1
      end
    ) / count(*)::decimal * 100,
    2
  ) as poor_query_percentage
from
  queries
group by
  query_name
order by
  query_name desc;