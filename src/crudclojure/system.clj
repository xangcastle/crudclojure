(ns crudclojure.system
  (:require [com.stuartsierra.component :as component]
            [crudclojure.server :as server]
            [crudclojure.store :as store]
            [clojure.tools.logging :refer [error]]))

(def ^:redef system
  "Definiendo el sistema."
  nil)

(defn build-system
  "Definiendo las rutas del sistema."
  []
  (try
    (-> (component/system-map
         :server (server/make-server)
         :store (store/make-store))
        (component/system-using {:server [:store]}))
    (catch Exception e
      (error "Failed to build system" e))))

(defn init-system
  []
  (let [sys (build-system)]
    (alter-var-root #'system (constantly sys))))

(defn stop!
  "Detener el sistema."
  []
  (alter-var-root #'system component/stop-system))

(defn start!
  "Arrancar el sistema."
  []
  (alter-var-root #'system component/start-system)
  (println "Sistema iniciado"))
