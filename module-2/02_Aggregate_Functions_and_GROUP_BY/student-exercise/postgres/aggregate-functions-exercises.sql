-- The following queries utilize the "world" database.
-- Write queries for the following problems. 
-- Notes:
--   GNP is expressed in units of one million US Dollars
--   The value immediately after the problem statement is the expected number 
--   of rows that should be returned by the query.

-- 1. The name and state plus population of all cities in states that border Ohio 
-- (i.e. cities located in Pennsylvania, West Virginia, Kentucky, Indiana, and 
-- Michigan).  
-- The name and state should be returned as a single column called 
-- name_and_state and should contain values such as ‘Detroit, Michigan’.  
-- The results should be ordered alphabetically by state name and then by city 
-- name. 
-- (19 rows)
SELECT name || ',' || district AS name_state ,population 
FROM city
WHERE district in ('Pennsylvania' , 'West Virginia' , 'Kentucky' , 'Indiana' , 'Michigan')
ORDER BY name_state
;

-- 2. The name, country code, and region of all countries in Africa.  The name and
-- country code should be returned as a single column named country_and_code 
-- and should contain values such as ‘Angola (AGO)’ 
-- (58 rows)
SELECT name || ',' ||code as country_and_code ,  region
FROM country
WHERE continent IN ('Africa')
;
-- 3. The per capita GNP (i.e. GNP multipled by 1000000 then divided by population) of all countries in the 
-- world sorted from highest to lowest. Recall: GNP is express in units of one million US Dollars 
-- (highest per capita GNP in world: 37459.26)
SELECT round((gnp * 1000000) / population,2) as highest_to_lowest
FROM country
WHERE population <> 0
ORDER BY highest_to_lowest DESC
;
-- 4. The average life expectancy of countries in South America.
-- (average life expectancy in South America: 70.9461)
SELECT AVG(lifeexpectancy) as "lifeexpectancy_AVG"
FROM country
WHERE continent IN('South America')
-- 5. The sum of the population of all cities in California.
-- (total population of all cities in California: 16716706)
SELECT SUM(population) as "population_SUM"
FROM city
WHERE district IN('California')
-- 6. The sum of the population of all cities in China.
-- (total population of all cities in China: 175953614)
SELECT SUM(population) as "population_SUM"
FROM city
WHERE countrycode IN('CHN')
-- 7. The maximum population of all countries in the world.
-- (largest country population in world: 1277558000)
SELECT MAX(population) as "MAX_population"
FROM country
-- 8. The maximum population of all cities in the world.
-- (largest city population in world: 10500000)
SELECT MAX(population) as "MAX_population"
FROM city
-- 9. The maximum population of all cities in Australia.
-- (largest city population in Australia: 3276207)
SELECT MAX(population) as "MAX_population"
FROM city
WHERE countrycode in('AUS')
-- 10. The minimum population of all countries in the world.
-- (smallest_country_population in world: 50)
SELECT MIN (population) as "MIN_population"
FROM country
where population > 0
-- 11. The average population of cities in the United States.
-- (avgerage city population in USA: 286955.3795)
SELECT trunc(AVG (population),4) as "population_AVG"
FROM city
where countrycode = 'USA'
-- 12. The average population of cities in China.
-- (average city population in China: 484720.6997 approx.)
SELECT trunc(AVG (population),4) as "population_AVG"
FROM city
where  countrycode IN('CHN')
-- 13. The surface area of each continent ordered from highest to lowest.
-- (largest continental surface area: 31881000, "Asia")
SELECT SUM(surfacearea) || ',' || continent as sum_surfacearea
FROM country
GROUP BY continent;


-- 14. The highest population density (population divided by surface area) of all 
-- countries in the world. 
-- (highest population density in world: 26277.7777)
SELECT MAX(population / surfacearea) as population_density
FROM country
where surfacearea > 0 


-- 15. The population density and life expectancy of the top ten countries with the 
-- highest life expectancies in descending order. 
-- (highest life expectancies in world: 83.5, 166.6666, "Andorra")
SELECT lifeexpectancy , (population / surfacearea) as population_density , name
FROM country
where surfacearea > 0 AND lifeexpectancy IS NOT NULL 
ORDER BY lifeexpectancy DESC , population_density DESC,name DESC

-- 16. The difference between the previous and current GNP of all the countries in 
-- the world ordered by the absolute value of the difference. Display both 
-- difference and absolute difference.
-- (smallest difference: 1.00, 1.00, "Ecuador")
SELECT gnp - gnpold as difference, abs(gnp - gnpold) as abs_difference , name
FROM country
where gnpold IS NOT NULL
ORDER BY abs_difference ASC
-- 17. The average population of cities in each country (hint: use city.countrycode)
-- ordered from highest to lowest.
-- (highest avg population: 4017733.0000, "SGP")
SELECT trunc(AVG(population), 4) AS AVG_POP , countrycode
FROM city
GROUP BY  countrycode
ORDER BY AVG_POP DESC
;
-- 18. The count of cities in each state in the USA, ordered by state name.
-- (45 rows)
SELECT COUNT(name), district
FROM city
WHERE countrycode ='USA'
GROUP BY  district
-- 19. The count of countries on each continent, ordered from highest to lowest.
-- (highest count: 58, "Africa")
SELECT COUNT(name) AS COUNT_COUN, continent
FROM country
GROUP BY  continent
ORDER BY COUNT_COUN DESC
-- 20. The count of cities in each country ordered from highest to lowest.
-- (largest number of  cities ib a country: 363, "CHN")
SELECT COUNT(district) AS COUNT_COUN, countrycode
FROM city
GROUP BY  countrycode
ORDER BY COUNT_COUN DESC
-- 21. The population of the largest city in each country ordered from highest to 
-- lowest.
-- (largest city population in world: 10500000, "IND")
SELECT MAX(population) AS COUNT_COUN, countrycode
FROM city
GROUP BY  countrycode
ORDER BY COUNT_COUN DESC
-- 22. The average, minimum, and maximum non-null life expectancy of each continent 
-- ordered from lowest to highest average life expectancy. 
-- (lowest average life expectancy: 52.5719, 37.2, 76.8, "Africa")
SELECT AVG(lifeexpectancy) AS AVG_lifeexpectancy ,MIN(lifeexpectancy) AS MIN_lifeexpectancy ,
MAX(lifeexpectancy) AS MAX_lifeexpectancy , continent
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY  continent
ORDER BY AVG_lifeexpectancy ASC