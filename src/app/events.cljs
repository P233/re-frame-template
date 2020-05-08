(ns app.events
  (:require
   [re-frame.core :as rf]
   [app.db :as db]))

(rf/reg-event-db
 :initialize-db
 (fn []
   db/default-db))

(rf/reg-event-db
 :increase-counter
 (fn [db]
   (update db :counter inc)))

(rf/reg-event-db
 :decrease-counter
 (fn [db]
   (update db :counter dec)))
