-- :name create- foo-table :! 
CREATE TABLE IF NOT EXISTS foo (
  id bigserial PRIMARY KEY,
  name varchar NOT NULL,
  description text NOT NULL,
  created_at timestamp NOT NULL default current_timestamp
)
 
-- :name drop-foo-table :! 
DROP TABLE IF EXISTS foo
 
-- :name insert-foo :! :n 
INSERT INTO foo (name, description)
VALUES (:name, :description)
 
-- :name foo-by-name-like :? :1 
SELECT * FROM foo WHERE name LIKE :name-like
 
-- :name foo-with-cols :? :* 
SELECT :i*:cols FROM foo