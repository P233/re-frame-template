(ns app.subs
  (:require
   [re-frame.core :as rf]))


(rf/reg-sub
  :counter
  (fn [db]
    (:counter db)))
