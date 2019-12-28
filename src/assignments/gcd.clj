(ns assignments.gcd)

(defn getRemainder [num1, num2] (mod num1 num2))

(defn gcd [num1 num2] (if (zero? num1) num2 (gcd (getRemainder num2 num1) num1)))