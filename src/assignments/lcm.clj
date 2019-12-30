(ns assignments.lcm
  (:require [assignments.gcd :refer [gcd]]))

(defn lcm [num1 num2] (/ (* num1 num2) (gcd num1 num2)))