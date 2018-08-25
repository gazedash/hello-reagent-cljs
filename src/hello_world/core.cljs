(ns hello-world.core
  (:require [reagent.core :as r]))

(.log js/console "Hey Seymore sup?!")

(defn on-click-function []
  (.log js/console "Hey Seymore sup?!"))

(defn some-component []
  [:div { :on-click #(on-click-function) }
   [:h3 "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red"]
    " text."]])

 (r/render some-component (js/document.getElementById "app"))