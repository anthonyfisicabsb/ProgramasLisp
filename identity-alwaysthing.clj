;; Funcao identidade
(defn do-nothing [x] x)
(println (do-nothing "Hello"))

;;Funcao que sempre retorna thing
(defn always-thing [& x] (str "thing"))
(println (always-thing 2 3 43 "sldlkw") )
