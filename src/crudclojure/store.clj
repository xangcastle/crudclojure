(ns crudclojure.store
  (:require [com.stuartsierra.component :as component]))

(defn add-new-paste
  "Agregar nueva key a la base de datos en memoria"
  [store content]
  (let [uuid (.toString (java.util.UUID/randomUUID))]
    (swap! (:data store) assoc (keyword uuid) {:content content})
    uuid))

(defn get-paste-by-uuid
  "Obtiene el valor de algo en memoria para una key."
  [store uuid]
  ((keyword uuid) @(:data store)))

(defrecord InMemoryStore [data]

  component/Lifecycle

  (start [this]
    (assoc this :data (atom {})))

  (stop [this] this))

(defn make-store
  []
  (map->InMemoryStore {}))
