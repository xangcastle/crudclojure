(ns crudclojure.main
  (:require [crudclojure.system :refer [init-system start!]]))

(defn -main [& args]
  (init-system)
  (start!))
