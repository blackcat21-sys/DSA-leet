SELECT 
    a.employee_id,
    a.name,
    round(count(b.reports_to)) as reports_count,
    round(avg(b.age)) as average_age
FROM Employees AS a 
INNER JOIN Employees AS b 
    ON b.reports_to = a.employee_id
group by a.employee_id,a.name
order by employee_id