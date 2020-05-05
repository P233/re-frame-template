(ns app.core
  (:require [reagent.dom :as rdom]
            [app.styles :as styles]))

(defn app
  []
  [:h1 {:class styles/block__element--modifier} "Hello, world!"])

(defn ^:dev/after-load mount
  []
  (rdom/render [app]
    (.getElementById js/document "app")))

(defn ^:export init
  []
  (mount))
