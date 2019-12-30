(ns assignments.lcm
  (:require [assignments.gcd :refer [getGcd]]))

(defn getLcm [num1 num2] (/ (* num1 num2) (getGcd num1 num2)))