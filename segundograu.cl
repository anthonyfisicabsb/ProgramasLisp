(defun raiz(a b c)
	(let ((disc (discr a b c)))
		(/ (+ (- b) (sqrt disc )) (* 2 a)))
)
