(ns clj-euler.problem-2)

;; build fib numbers below 10 (1, 2, 3, 5, 8)
;; begin with (1 2)  
;;    r add nth size - 1 nth size -2
;;    if r < x
;;    (conj  (1 2) r
(defn build-fib
  []
  (let [r (atom [1 2])
        size (count r) 
        cur (+ (nth r (dec size))
               (nth r (- size 2)))]
    (while (< x cur)
      (do (swap! r conj cur)
          (swap!)))))
  