(ns crudclojure.db.recipes
  (:require [hugsql.core :as hugsql]))

(hugsql/def-db-fns "crudclojure/db/sql/foo.sql")