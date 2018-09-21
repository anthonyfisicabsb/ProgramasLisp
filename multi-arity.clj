(defn greeting
    ([] (str "Hello, World!"))
    ([x] (str "Hello, " x "!"))
    ([x y] (str x ", " y "!" ))
)

;;For testing
(assert (= "Hello, World!" (greeting)))
(assert (= "Hello, Clojure!" (greeting "Clojure")))
(assert (= "Good Morning, Clojure!" (greeting "Good Morning" "Clojure")))
