-- Method 1 with case when then else end
-- update salary set sex = (case when sex = 'm' then 'f' else 'm' end);


-- Method 2 with if()
update salary set sex = if(sex = 'm', 'f', 'm');