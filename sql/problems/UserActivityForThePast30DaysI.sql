# Write your MySQL query statement below
select activity_date  as day, count(distinct user_id) as  active_users 
from Activity 
where DATEDIFF("2019-07-27", activity_date) < 30 
group by activity_date 
having count(user_id) > 0
order by activity_date;