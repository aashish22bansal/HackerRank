/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE SUBSTR(CITY, LENGTH(CITY), 1) IN ('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');