#lang racket

;Question 1

(display"question 1: \n")


(cons 4(cons (cons 7(cons 22 '())) (cons "art"(cons(cons "math"  (cons (cons 8 '()) (cons 99 '())))(cons 100'())))))

(list 4 (list 7 22) "art"(list "math"(list 8)99) 100)

(quote (4(7 22) "art" ( "math" (8) 99) 100))

;Question 2

(display"question 2: \n")


(define map1 (lambda(f g L)
                  (if(= (length L) 1)L
                    (map1 f g (cons (f g (car L) (car (cdr L))) (cdr (cdr L)))))))
(define action (lambda (g x y) (g x y)))

(define listAct (lambda (g L)(map1 action g L)))

(listAct * '(1 2 3 4 5 6 7)) ;change the operation sign and list any time


;Question 3

(display"question 3: \n")

(define map2 (lambda(f n L resList)
                  (if(null? L)(reverse resList)
                    (map2 f n (cdr L) (cons (f n (car L)) resList )))))
(define action1 (lambda (y x) (* x (- 1 y))))

(define listAct1 (lambda (n L resList)(map2 action1 n L resList)))


(listAct1 0.2 '(1 2 3 4 5 6 7)'());change the  the persent rate and list any time

;Question 4

(display"question 4: \n")


(define Avg (lambda (L sum n)
              (if(null? L)(/ sum n)
                 (Avg (cdr L) (+ (car L) sum) (+ 1 n)))))
(Avg '(1 2 3 4 5 6 7) 0 0)


; Question 5

(display"question 5: \n")

(require kw-utils/partial)

(define numList (lambda (L f result)
                  (cond ((equal? (car '( + )) (car L))(f + (cdr L) result)) 
                        ((equal? (car '( - )) (car L))(f - (cdr L) result))
                        ((equal? (car '( * )) (car L))(f * (cdr L) (+ 1 result)))
                        ((equal? (car '( / )) (car L))(f * (cdr L) (+ 1 result)))
                    (else (display " No operation \n")))))

(define operation (lambda (g L result)
                    (if (null? L)result
                        (operation g (cdr L) (g result (car L))))))

(numList '(* 1 2 3 4 5) operation 0)



; Question 6

(display"question 6: \n")

(define myFilter (lambda (L)
                   (if (null? L) '()
                       (cons (car L) (myFilter ( filter (lambda (x) (not (equal? x (car L))))(cdr L)))))))

(define joiner (lambda (f L g K) (cons (f L) (g K))))

(joiner myFilter '(1 1 2 2 3 4 5 ) myFilter '("a" "b" "a" "c"))
                 
                 
              


;Question 7

(display"question 7: \n")

(define L1 '(1 -1 4 -2 9 -3))

(define rmNeg(lambda(L resultL)
               (if (null? L)(reverse resultL)
                   (cond ((< (car L) 0) (rmNeg (cdr L) resultL))
                      (else (rmNeg (cdr L) (cons (car L) resultL)))))))

(let ([f (future (lambda () (rmNeg L1 '())))])
  (map(lambda (number) (sqrt number ))(touch f)))


;Question 9

(display"question 9: \n")

(define leapYr(lambda (a b L)
                (if (> a b) L
                    (leapYr (+ a 4) b (cons a L)))))
(leapYr 1800 2018 '() )
