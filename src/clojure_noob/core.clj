(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))
; (defn error-message
;   [severity]
;   (str "OH GOD! IT'S A DISASTER! WE'RE "
;     (if (= severity :mild)
;       "MILDLY INCONVENIENCED!"
;       "DOOOOOOMMEDDD!")))
; ; (error-message :mild)
; (defn too-enthusiastic
;   "Return a cheer that might be a bit too enthusiatic"
;   [name]
;   (str "OH. MY. GOD! " name " YOU ARE DEFINITELY LIKE THE BEST "
;   "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))
;
;   (too-enthusiastic "Zelda")
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

; (defn x-chop
;   "Describe the kind of chop you're inflicting on someone"
;   ([name chop-type]
;     (str "I " chop-type " chop " name "! Take that!"))
;     ([name]
;       (x-chop name "karate")))
;
; (defn weird-arity
;   ([]
;      "Destiny dressed you this morning, my friend, and now Fear is
;      trying to pull off your pants. If you give up, if you give in,
;      you're gonna end up naked with Fear just standing there laughing
;      at your dangling unmentionables! - the Tick")
;   ([number]
;      (inc number)))
;
; (defn codger-communication
;   [whippersnapper]
;   (str "Get off my lawn, " whippersnapper "!!!"))
; (defn codger
;   [& whippersnappers]
;   (map codger-communication whippersnappers))
;   ;; Return the first element of a collection
; (defn my-first
;   [[first-thing]] ; Notice that first-thing is within a vector
;   first-thing)
;
; (my-first ["oven" "bike" "war-axe"])
; ; => "oven"
;
; (defn chooser
;   [[first-choice second-choice & unimportant-choices]]
;   (println (str "Your first choice is: " first-choice))
;   (println (str "Your second choice is: " second-choice))
;   (println (str "We're ignoring the rest of your choices. "
;                 "Here they are in case you need to cry over them: "
;                 (clojure.string/join ", " unimportant-choices))))
;
; (chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])
; => Your first choice is: Marmalade
; => Your second choice is: Handsome Jack
; => We're ignoring the rest of your choices. Here they are in case \
    ;  you need to cry over them: Pigpen, Aquaman

; (defn announce-treasure-location
;     [{lat :lat lng :lng}]
;   (println (str "latitude: " lat))
;   (println (str "longitude: " lng)))

; (defn announce-treasure-location
;    [{lat :lat lng :lng}]
;   (println (str "Treasure lat: " lat))
;   (println (str "Treasure lng: " lng)))
