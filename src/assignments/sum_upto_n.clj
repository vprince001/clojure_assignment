(ns assignments.sum_upto_n)

(defn getSumUptoN [n]
  ( -> n
       (+ 1)
       (* n)
       (/ 2)))