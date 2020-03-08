(defproject crudclojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [aleph "0.4.6"]
                 [hiccup "1.0.5"]
                 [bidi "2.1.3"]               
                 [org.clojure/java.jdbc "0.7.3"]
                 [org.postgresql/postgresql "42.1.4"]
                 [clojure.jdbc/clojure.jdbc-c3p0 "0.3.3"]
                 [com.layerware/hugsql "0.4.8"]]
  :main ^:skip-aot crudclojure.main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
