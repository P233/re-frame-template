(ns app.core
  (:require [reagent.dom :as rdom]))

(defn app
  []
  [:div "Hello, world!"])

(defn ^:dev/after-load mount
  []
  (rdom/render [app]
    (.getElementById js/document "app")))

(defn ^:export init
  []
  (mount))
