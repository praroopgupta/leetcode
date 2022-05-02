# Write your MySQL query statement below
select a.id from weather as a where a.temperature > (select b.temperature from weather as b where b.recorddate=a.recorddate-1);