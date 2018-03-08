/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
This is for Oracle SQL.
MySQL uses a concat function instead of '||' or '+'. This would make the first select statement look like:
select distinct 
  concat(Name, '(', substr(Occupation,1,1), ')') as OccupationShort 
from Occupations 
Order By OccupationShort;
*/

select distinct 
  Name||'('||substr(Occupation,1,1)||')' as OccupationShort 
from Occupations
Order By OccupationShort; 


select 
  'There are a total of '||count(Occupation) as numjobs, 
  lower(Occupation)||'s.' as job 
from Occupations 
group by Occupation 
order by numjobs, job;
