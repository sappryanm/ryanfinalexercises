-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)VALUES ('HAMPTON', 'AVENUE');
INSERT INTO actor (first_name, last_name)VALUES ('LISA', 'BYWAY');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI','The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece', 2008, (SELECT language_id FROM language WHERE name = 'ENGLISH'), 198);
INSERT INTO film (title, description, release_year, language_id, length) 
VALUES ('Euclidian PI', 'The epic story of Euclid as a pizza delivery boy in
ancient Greece', 2008, (SELECT language_id FROM language WHERE name='English'), 198);
/*
film_id serial NOT NULL,
title varchar(255) NOT NULL,
description varchar(512),
release_year smallint,
language_id integer NOT NULL,
original_language_id integer,
rental_duration smallint DEFAULT 3 NOT NULL,
rental_rate numeric(4,2) DEFAULT 4.99 NOT NULL,
length smallint,
replacement_cost numeric(5,2) DEFAULT 19.99 NOT NULL,
rating varchar(5) DEFAULT 'G',
*/

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- verprotective mother, in the film, "Euclidean PI". Add them to the film.
--INSERT INTO film_actor (actor_id, film_id)
--VALUES (SELECT actor_id FROM actor WHERE actor.first_name = 'HAMPTON' AND actor.last_name = 'AVENUE');
SELECT film_id FROM film WHERE title = 'Euclidean PI';
INSERT INTO film_actor (actor_id, film_id)
VALUES (201,1002);
INSERT INTO film_actor (actor_id, film_id)
VALUES (202,1002);

INSERT INTO film_actor (film_id, actor_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), (SELECT actor_id FROM actor WHERE first_name = 'LISA' AND last_name = 'BYWAY'));
--SELECT actor_id FROM actor WHERE actor.first_name = 'HAMPTON' AND actor.last_name = 'AVENUE';
-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES ('Mathmagical');
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title IN ('Euclidean PI')), (SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title IN ('EGG IGBY')), (SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title IN ('KARATE MOON')), (SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title IN ('RANDOM GO')), (SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title IN ('YOUNG LANGUAGE')), (SELECT category_id FROM category WHERE name = 'Mathmagical'));
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
WHERE film_id IN (
SELECT film_id FROM film_category WHERE category_id IN (
SELECT category_id FROM category WHERE name = 'Mathmagical'));
-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), 1), ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), 2);
-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM film
WHERE title = 'Euclidean PI';
--It did not delete because of the foreign key contstraint.

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category
WHERE name = 'Mathmagical';

--It did not delete because of foreign key contstraints.
-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
DELETE FROM film_category
WHERE category_id = 17;

Yes it deleted 4 entries
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
DELETE FROM category
WHERE name = 'Mathmagical';
--Deleted 1 because I believe I had a null value.
DELETE FROM film
WHERE title = 'Euclidean PI';

--Deleted 0 because I believe I already deleted them earlier.
-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

--All References to Euclid would need to be deleted so it didnt call any foreign keys that did not exist.
