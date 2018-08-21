(ns tut08.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn say "Fizzを考えた実装" [n]
  (cond (= 0 (mod n 3)) "Fizz"
  :else n))
