# Write your MySQL query statement below
SELECT DISTINCT s.* FROM Stadium s JOIN Stadium a
ON s.id BETWEEN a.id AND a.id + 2
WHERE s.people >= 100 AND a.people >= 100
AND EXISTS(
    SELECT 1 FROM Stadium b
    WHERE b.id = a.id + 1 AND b.people >= 100
)
AND EXISTS(
    SELECT 1 FROM Stadium c
    WHERE c.id = a.id + 2 AND c.people >= 100
)
ORDER BY visit_date ASC;