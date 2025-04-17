# Write your MySQL query statement below
select Email from Person Group by email Having count(email)>1;