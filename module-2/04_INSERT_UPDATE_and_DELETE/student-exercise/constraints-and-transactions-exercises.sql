-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
START TRANSACTION
INSERT INTO actor (first_name, last_name)
VALUES ('Hampton', 'Avenue'),('Lisa' , 'Byway')


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film (title, description, language_id ,release_year,length)
VALUES ('Euclidean PI' , 'The epic story of Euclid as a pizza delivery boy in
 ancient Greece' , '1' , '2008' ,'198')

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name='Hampton' AND last_name='Avenue') ,(SELECT film_id FROM film WHERE title = 'Euclidean PI'))
INSERT INTO film_actor (actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name='Lisa' AND last_name='Byway') ,(SELECT film_id FROM film WHERE title = 'Euclidean PI'))
-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES ('Mathmagical')

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI') ,('17'))
;
INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title = 'EGG IGBY') ,('17'))
;
INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title = 'KARATE MOON') ,('17'))
;
INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title = 'RANDOM GO') ,('17'))
;
INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE title = 'YOUNG LANGUAGE') ,('17'))
;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film 
SET rating = 'G'
From film_category
WHERE film.film_id = film_category.film_id AND film_category.category_id = category_id AND category_id= '17'

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI') ,('1'))
;
INSERT INTO inventory (film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI') ,('2'))
;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <NO because "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor">

DELETE FROM film
WHERE title = 'Euclidean PI'
;

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <NO, because  "category" violates foreign key constraint "film_category_category_id_fkey" on table "film_category"
DELETE FROM category
WHERE name = 'Mathmagical'
;
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YES , because was not related to and table or F.K>
DELETE FROM film_category
WHERE category_id = 17

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <Mathmagical YES , because were not related to table or F.K 
--And Euclidean PI NO because  "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"
DELETE FROM category
WHERE name = 'Mathmagical'

DELETE FROM film
WHERE title = 'Euclidean PI'
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

-- must delete the rerelated F.K from inventory and film_actor 


ROLLBACK
COMMIT