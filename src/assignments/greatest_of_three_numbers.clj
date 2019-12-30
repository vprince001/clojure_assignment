(ns assignments.greatest-of-three-numbers)

(defn getGreatestOfThreeNumbers [num1 num2 num3]
  (if (> num1 num2)
    (if (> num1 num3) num1 num3)
    (if (> num2  num3) num2 num3)))