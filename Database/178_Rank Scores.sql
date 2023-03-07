select
    score,
    DENSE_RANK() over (
        order by
            score desc
    ) as 'rank'
from scores
order by score desc;