CREATE FUNCTION GETNTHHIGHESTSALARY(N INT) RETURNS 
INT BEGIN 
	RETURN (
	        select
	            distinct salary
	        from (
	                select
	                    dense_rank() over(
	                        order by
	                            salary desc
	                    ) as Salary_Rank,
	                    salary
	                from
	                    employee
	            ) as T
	        where
	            T.Salary_Rank = N
	    );
	END 
