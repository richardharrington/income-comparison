(ns income-comparison.events
    (:require [re-frame.core :as re-frame]
              [income-comparison.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
