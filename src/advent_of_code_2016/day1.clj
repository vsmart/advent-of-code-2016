(ns advent-of-code-2016.day1)

(def next-direction
  {:RN :E
   :RE :S
   :RS :W
   :RW :N
   :LN :W
   :LE :N
   :LS :E
   :LW :S })

(defn read-input-file
  []
  (->
    "resources/day1_input"
    (slurp)
    (clojure.string/split #", ")
    (clojure.string/trim)))

(defn calc-distance
  []
  (let [position [0 0]
        instructions (read-input-file)
        dir ()]
    ( position
      ())))

(defn apply-move
  [position move]
  (let [move-dir (first move)
        move-scale (rest move)
        next-dir (str posi)
        ])
  )
