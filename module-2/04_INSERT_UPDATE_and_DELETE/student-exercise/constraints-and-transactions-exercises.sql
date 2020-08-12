-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
BEGIN;
INSERT INTO actor(first_name, last_name)
VALUES ('HAMPTON', 'AVENUE'), ('LISA', 'BYWAY');
COMMIT;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
BEGIN;
INSERT INTO film(title, description, release_year, language_id, length)
VALUES ('EUCLIDIAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);
COMMIT;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

BEGIN;
INSERT INTO film_actor (film_id, actor_id)
VALUES (1002, 204);

INSERT INTO film_actor (film_id, actor_id)
VALUES (1002, 203);
COMMIT;


-- 4. Add Mathmagical to the category table.

BEGIN;
INSERT INTO category(name)
VALUES ('Mathmagical');
COMMIT;


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

BEGIN;
INSERT INTO film_category(category_id, film_id)
VALUES(18, 1002);
UPDATE film_category
SET category_id = 18
WHERE film_id IN (SELECT film_id FROM film WHERE title IN ('EUCLIDIAN PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'));
COMMIT;



-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
BEGIN;
UPDATE film
SET rating = 'G'
WHERE film_id IN (SELECT film_id FROM film_category WHERE film_category.category_id = 18);
COMMIT;

-- 7. Add a copy of "Euclidean PI" to all the stores.
BEGIN;
INSERT INTO inventory(film_id, store_id)
VALUES (1002, 1);
INSERT INTO inventory(film_id, store_id)
VALUES (1002, 2);
COMMIT;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
BEGIN;
DELETE FROM film
WHERE title = 'EUCLIDIAN PI';
ROLLBACK;
-- <violates foreign key constraint>

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
BEGIN;
DELETE FROM category
WHERE name = 'Mathmagical';
ROLLBACK;
-- <violates foreign key constraint>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
BEGIN;
DELETE FROM film_category
WHERE category_id = 18;

COMMIT;


-- <yes, didnt violate any constraints>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
BEGIN;
DELETE FROM category
WHERE name = 'Mathmagical';
COMMIT;
BEGIN;
DELETE FROM film
WHERE title = 'EUCLIDIAN PI';
ROLLBACK;
-- <1st successful, 2nd fails. deleting category works because it is nolonger tied to foreign key constraint of the film_category table, 2nd fails for the same reason is has been failing>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

-- we would have to remove the film from the actors we inserted earlier in the exercise
