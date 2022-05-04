# Write your MySQL query statement below
select user_id, max(time_stamp) as last_stamp from logins where time_stamp between '2020-01-01' and '2021-01-01' group by user_id order by user_id;