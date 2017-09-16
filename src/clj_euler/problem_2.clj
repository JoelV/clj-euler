(ns clj-euler.problem-2)

;; build fib numbers below 10 (1, 2, 3, 5, 8)
;; begin with (1 2)  
;;    r add nth size - 1 nth size -2
;;    if r < x
;;    (conj  (1 2) r
(def r (atom [1 2]))

(defn build-fib
  []
  (let [size (count @r) 
        cur (+ (nth @r (dec size))
               (nth @r (- size 2)))]
    (if (< cur 4000000)
      (do 
        (swap! r conj cur)
        (build-fib))
      @r)))   


(defn solution
  []
  (reduce + 0 (filter even? (build-fib))))

