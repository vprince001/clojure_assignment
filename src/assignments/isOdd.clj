(ns assignments.isOdd
  (:require [assignments.isEven :refer :all]))

(defn isOdd [number] (not (isEven number)))