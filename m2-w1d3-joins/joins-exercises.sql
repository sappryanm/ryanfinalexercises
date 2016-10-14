-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
--    Rows: 30
SELECT title
FROM film
WHERE film_id IN (
	SELECT film_id
	FROM film_actor
	WHERE actor_id =(
		SELECT actor_id
		FROM actor
		WHERE first_name = 'NICK' AND last_name = 'STALLONE'));

SELECT title
FROM film
INNER JOIN film_actor fa
ON film.film_id = fa.film_id
INNER JOIN actor
ON fa.actor_id = actor.actor_id
WHERE actor.first_name = 'NICK' AND actor.last_name = 'STALLONE';


SELECT title
FROM film
INNER JOIN film_actor fa
ON film.film_id = fa.film_id
INNER JOIN actor
ON fa.actor_id = actor.actor_id
WHERE actor_id =c);

-- 2. All of the films that Rita Reynolds has appeared in
--    Rows: 20
SELECT title
FROM film
WHERE film_id IN (
	SELECT film_id
	FROM film_actor
	WHERE actor_id =(
		SELECT actor_id
		FROM actor
		WHERE first_name = 'RITA' AND last_name = 'REYNOLDS'));
-- 3. All of the films that Judy Dean or River Dean have appeared in
--    Rows: 46
SELECT title
FROM film
WHERE film_id IN (
SELECT film_id
FROM film_actor
WHERE actor_id = (
SELECT actor_id
FROM actor
WHERE first_name = 'JUDY' AND last_name = 'DEAN') OR actor_id = (
SELECT actor_id
FROM actor
WHERE first_name = 'RIVER' AND last_name = 'DEAN'));
-- 4. All of the the ‘Documentary’ films
--    Rows: 68
SELECT title
FROM film
INNER JOIN film_category fc
ON film.film_id = fc.film_id
INNER JOIN category
ON fc.category_id = category.category_id
WHERE category.name = 'Documentary';
-- 5. All of the ‘Comedy’ films
--    Rows: 58
SELECT title
FROM film
INNER JOIN film_category fc
ON film.film_id = fc.film_id
INNER JOIN category
ON fc.category_id = category.category_id
WHERE category.name = 'Comedy';
-- 6. All of the ‘Children’ films that are rated ‘G’
--    Rows: 10 
SELECT title
FROM film
INNER JOIN film_category fc
ON film.film_id = fc.film_id
INNER JOIN category
ON fc.category_id = category.category_id
WHERE category.name = 'Children' AND film.rating = 'G';
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
--    Rows: 3
SELECT title
FROM film
INNER JOIN film_category fc
ON film.film_id = fc.film_id
INNER JOIN category
ON fc.category_id = category.category_id
WHERE category.name = 'Family' AND film.rating = 'G' AND film.length <120;
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
--    Rows: 9
SELECT title
FROM film
INNER JOIN film_actor fa
ON film.film_id = fa.film_id
INNER JOIN actor
ON fa.actor_id = actor.actor_id
WHERE actor.first_name = 'MATHEW' AND actor.last_name = 'LEIGH' AND film.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
--    Rows: 61

-- 10. All of the ‘Action’ films starring Nick Stallone
--     Rows: 2

-- 11. The address of all stores, including street address, city, district, and country
--     Rows: 2

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
--     Rows: 2

-- 13. The first and last name of the top ten customers ranked by number of rentals 
--     Hint: #1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals

-- 14. The first and last name of the top ten customers ranked by dollars spent 
--     Hint: #1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
--     Hint: Store 1 has 7928 total rentals and Store 2 has 8121 total rentals

-- 16. The top ten film titles by number of rentals 
--     Hint: #1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals

-- 17. The top five film categories by number of rentals 
--     Hint: #1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals

-- 18. The top five Action film titles by number of rentals 
--     Hint: #1 should have 30 rentals and #5 should have 28 rentals

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
--     Hint: #1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
--     Hint: #1 should have 87 rentals and #10 should have 72 rentals
