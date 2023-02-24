select *
from patients
where
    conditions like '% DIAB1%'
    or conditions like 'DIAB1%';

/* can also use regular expressions : https://leetcode.com/problems/patients-with-a-condition/solutions/2059131/regexp-one-liner-mysql/ */