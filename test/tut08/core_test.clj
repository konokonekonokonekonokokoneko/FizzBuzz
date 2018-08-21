(ns tut08.core-test
  (:require [clojure.test :refer :all]
    [tut08.core :refer :all]))

(are [n] (= n (say n))
 1
 2)

(is (= "Fizz" (say 3)))

(testing "FizzBuzzは"
  (testing "3の倍数でも5の倍数でもない場合はその数を返します"
    (are [n] (= n (say n))
         1
         2))
  (testing "3の倍数の時Fizzを返す"
    (are [n] (= "Fizz" (say n))
         3
         6)))
