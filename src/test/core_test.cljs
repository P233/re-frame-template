(ns test.core-test
  (:require [cljs.test :refer [deftest is]]
            [app.helpers :as helpers]))

(deftest example-test
  (is (= (helpers/add 4) 5)))
