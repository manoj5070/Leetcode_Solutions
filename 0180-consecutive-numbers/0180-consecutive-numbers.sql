# Write your MySQL query statement below
select distinct l.num as ConsecutiveNums from Logs l,Logs l1,Logs l2
where l.id=l1.id-1 and l.id=l2.id-2 and l.num=l1.num and l.num=l2.num;