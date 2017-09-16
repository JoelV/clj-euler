(ns clj-euler.problem-1)

(defn is-mult?
  [x y]
  (= 0 (mod x y)))

(defn is-mult-3-or-5?
  [x]
  (or (is-mult? x 3)
      (is-mult? x 5)))

(defn solve
  [x]
  (reduce + (filter is-mult-3-or-5? (range x))))
  