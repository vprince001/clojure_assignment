(ns assignments.cube
  (:require [assignments.square :refer [square]]))

(defn getCube [number] (* (square number) number))