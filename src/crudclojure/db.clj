(ns cloudclojure.db
  (:require [jdbc.pool.c3p0 :as pool]))

(def spec
  (pool/make-datasource-spec
   {:subprotocol "postgresql"
    :subname "//localhost:5432/crudclojure"
    :user "postgres"
    :password "ABC123#$"}))