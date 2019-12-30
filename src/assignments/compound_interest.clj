(ns assignments.compound_interest)

(defn getCompoundInterest [principal rate time]
  (-> rate
      (/ 100)
      (+ 1)
      (Math/pow time)
      (* principal)
      (- principal)
      (float)))