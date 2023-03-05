select
    id, (
        case
            when p_id is null then 'Root'
            when id in (
                select id
                from Tree
                where
                    id not in (
                        select
                            p_id
                        from
                            Tree
                        where
                            p_id is not null
                    )
            ) then 'Leaf'
            else 'Inner'
        end
    ) as type
from Tree;