(ns clj-euler.problem-2)

;; stolen from clj-docs
(defn fib
  ([] (fib 1 2))
  ([a b]  (lazy-seq (cons a (fib b (+ a b))))))

(defn build-fib
  []
  (take-while #(< % 4000000) (fib)))

(defn solution
  []
  (reduce + 0 (filter even? (build-fib))))

