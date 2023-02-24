/* Method1 : comparing with directly 'Y' or 'N' */

/* select product_id
 from products
 where
 low_fats = 'Y'
 and recyclable = 'Y'; */

/* METHOD2: comparing with 1 based index as we can refer the scheme of the table here 
 we can see the first value is 'Y' so its index is 1 by default and 'N' is same as 2 */

/* Schema of the table */

/* Create table
 If Not Exists Products (
 product_id int,
 low_fats ENUM('Y', 'N'),
 recyclable ENUM('Y', 'N')
 ) */

select product_id
from products
where
    low_fats = 1
    and recyclable = 1;