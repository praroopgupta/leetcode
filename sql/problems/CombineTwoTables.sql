# Write your MySQL query statement below
select p.firstName, p.lastname, d.city, d.state from person as p left join address as d on p.personId = d.personId;