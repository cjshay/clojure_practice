(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))
(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
    (if (= severity :mild)
      "MILDLY INCONVENIENCED!"
      "DOOOOOOMMEDDD!")))
; (error-message :mild)
(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiatic"
  [name]
  (str "OH. MY. GOD! " name " YOU ARE DEFINITELY LIKE THE BEST "
  "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

  (too-enthusiastic "Zelda")
  ; 
  ; (defn multi-arity
  ;   ; 3-arity arguments and body
  ;   ([first-arg second-arg third-arg]
  ;     (do-things first-arg second-arg third-arg))
  ;     ; 2-arity arguments and body
  ;     ([first-arg second-arg]
  ;       (do-things first-arg second-arg))
  ;       ; 1-arity arguments and body
  ;     ([first-arg]
  ;       (do-things first-arg)))

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
    (str "I " chop-type " chop " name "! Take that!"))
    ([name]
      (x-chop name "karate")))
