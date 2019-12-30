(ns assignments.cube
  (:require [assignments.square :refer [square]]))

(defn cube [number] (* (square number) number))