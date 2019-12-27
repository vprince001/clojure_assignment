(ns assignments.isEven)

(defn isEven [number] (if (= (mod number 2) 0) true false ))