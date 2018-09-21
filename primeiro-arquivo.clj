;; Carrega o namespace e faz as funções serem válidas no contexto local
(require '[clojure.repl :refer :all])

;; Computa a soma de dois números
(println (+ 7654 1234))

;; Computa uma expressão algébrica
(println (/ (* (+ 7 3) (+ 4 5)) 10))

;; Encontra a documentação de duas funções
(doc rem)
(doc mod)

;; Usando find-doc
(find-doc "stacktrace exception")
