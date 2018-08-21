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
         6))
  (testing "5の倍数の時Buzzを返す"
    (are [n] (= "Buzz" (say n))
         5
         10))
  (testing "3の倍数でありかつ5の倍数である時FizzBuzzと返す"
    (are [n] (= "FizzBuzz" (say n))
         15
         30)))
