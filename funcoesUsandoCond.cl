(defun maior(x y)
	(cond
		((> x y) x)
		(t y)
	)
)
(defun maior3(x y z) 
	(cond 
		((and (>= x y) (>= x z)) x)
		((and (>= y x) (>= y z)) y)
		((and (>= z x) (>= z y)) z)
	)
)
