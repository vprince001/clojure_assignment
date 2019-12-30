(ns assignments.compoundInterest)

(defn compoundInterest [principal rate time] (- (* principal (Math/pow (+ 1 (/ rate 100)) time)) principal))