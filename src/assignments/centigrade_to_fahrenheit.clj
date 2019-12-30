(ns assignments.centigrade-to-fahrenheit)

(defn convertCentigradeToFahrenheit [centigrade]
  ( -> centigrade
       (* 9)
       (/ 5)
       (+ 32)
       (float)))