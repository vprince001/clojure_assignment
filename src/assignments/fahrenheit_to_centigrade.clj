(ns assignments.fahrenheit-to-centigrade)

(defn convertFahrenheitToCentigrade [Fahrenheit]
  (-> Fahrenheit
      (- 32)
      (* 5)
      (/ 9)))

(print (convertFahrenheitToCentigrade 41))