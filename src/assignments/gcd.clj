(ns assignments.gcd)

(defn getRemainder [num1, num2] (mod num1 num2))

(defn getGcd [num1 num2] (if (zero? num1) num2 (getGcd (getRemainder num2 num1) num1)))