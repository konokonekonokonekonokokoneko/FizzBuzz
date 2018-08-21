(ns tut08.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn say "FizzBuzzを考えた実装" [n]
  (cond
    (= 0 (mod n 15)) "FizzBuzz"
    (= 0 (mod n 3)) "Fizz"
    (= 0 (mod n 5)) "Buzz"
    :else n))

; 残念なことに文字列に対応していない
