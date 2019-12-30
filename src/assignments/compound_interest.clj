(ns assignments.compound_interest)

(defn getCompoundInterest [principal rate time] (- (* principal (Math/pow (+ 1 (/ rate 100)) time)) principal))