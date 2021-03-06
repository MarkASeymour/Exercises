-- SELECT ... FROM
-- Selecting the names for all countries
SELECT name from country;
select count(name) from country;


-- Selecting the name and population of all countries
SELECT name, population FROM country;


-- Selecting all columns from the city table
SELECT * FROM CITY;


-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
SELECT * FROM CITY WHERE countrycode = 'USA';

SELECT * FROM CITY WHERE district = 'Ohio';

-- Selecting countries that gained independence in the year 1776
SELECT * FROM country where indepyear = 1776;


-- Selecting countries not in Asia
SELECT name, continent FROM country WHERE continent <> 'Asia';


-- Selecting countries that do not have an independence year
SELECT indepyear FROM country;
SELECT * FROM country where indepyear IS NULL;

-- Selecting countries that do have an independence year
SELECT * FROM country where indepyear IS NOT NULL;


-- Selecting countries that have a population greater than 5 million
SELECT * FROM COUNTRY WHERE population > 5000000;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
SELECT * FROM CITY WHERE DISTRICT = 'Ohio' AND population > 400000

-- Selecting country names on the continent North America or South America
SELECT name as myawesomenewname, continent FROM country WHERE continent = 'North America' OR continent = 'South America'
SELECT name, continent FROM country WHERE continent IN ('North America', 'South America');




-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword
SELECT name, population, lifeexpectancy, ( population / surfacearea ) AS density FROM country WHERE continent = 'Asia' AND population > 100000 ORDER BY DENSITY DESC


