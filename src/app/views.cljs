(ns app.views
  (:require
   [re-frame.core :as rf]
   [app.styles :as styles]))


(defn increase-button []
  [:button
   {:on-click #(rf/dispatch [:increase-counter])}
   "+"])

(defn decrease-button []
  [:button
   {:on-click #(rf/dispatch [:decrease-counter])}
   "-"])

(defn page []
  [:<>
   [:h1
    {:class styles/h1}
    "Counter: " @(rf/subscribe [:counter])]
   [:div
    [increase-button]
    [decrease-button]]])
