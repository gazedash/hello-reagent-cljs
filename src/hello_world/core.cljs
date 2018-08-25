(ns hello-world.core
  (:require [reagent.core :as r]))

(.log js/console "Hey Seymore sup?!")
(defn some-component []
  [:div
   [:h3 "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red"]
    " text."]])

 (r/render some-component (js/document.getElementById "app"))