(ns crudclojure.foo
  (:require [crudclojure.db.foo :as db-foo]
            [crudclojure.db :as db]))

(defn add-foo
  [name description]
  (db-foo/insert-foo db/spec {:name name :description description}))

(defn get-foo
  [name]
  (db-foo/foo-by-name-like db/spec {:name-like name}))

(defn get-foo-all
  ([]
   (get-foo-all ["name" "description"]))
  ([cols]
   (db-foo/foo-with-cols db/spec {:cols (map name cols)})))