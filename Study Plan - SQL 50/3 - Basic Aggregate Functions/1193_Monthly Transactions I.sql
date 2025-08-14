select
  concat (
    to_char (trans_date, 'YYYY'),
    '-',
    to_char (trans_date, 'MM')
  ) as month,
  country,
  count(*) as trans_count,
  count(
    case
      when state = 'approved' then 1
    end
  ) as approved_count,
  sum(amount) as trans_total_amount,
  COALESCE(
    sum(
      case
        when state = 'approved' then amount
      end
    ),
    0
  ) as approved_total_amount
from
  transactions
group by
  concat (
    to_char (trans_date, 'YYYY'),
    '-',
    to_char (trans_date, 'MM')
  ),
  country;