(ns crudclojure.view
  (:require [hiccup.page :refer [html5 include-js include-css]]
            [hiccup.form :refer [form-to text-area submit-button]]))

(defn render-paste
  "Aqui se esta armando el html número 1."
  [paste]
  (html5 [:head
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/highlight.min.js")
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/go.min.js")
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/clojure.min.js")
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/yaml.min.js")
          (include-css "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/default.min.css")
          [:meta {:charset "UTF-8"}]
          [:script "hljs.initHighlightingOnLoad();"]]
         [:body
          [:pre [:code (:content paste)]]]))

(defn render-form
  "Aqui se esta armando el html número 2."
  []
  (html5 [:head
          [:meta {:charset "UTF-8"}]]
         [:body
          (form-to [:post "/"]
                   (text-area {:cols 80
                               :rows 10} "content")
                   [:div]
                   (submit-button "Paste!"))]))
