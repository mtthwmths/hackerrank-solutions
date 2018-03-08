/*
Enter your query here.
*/
select NAME from STUDENTS where MARKS > 75 order by substr(NAME,(length(NAME) - 2),3), ID;
