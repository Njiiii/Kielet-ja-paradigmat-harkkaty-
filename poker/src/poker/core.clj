(ns poker.core)


(defrecord Rank [name value])
(defrecord Card [rank suit])

;; Rank is playing cards face value. 2 is smallest, Ace is biggest.
(def ranks (map #(Rank. %1 %2)
                [:2 :3 :4 :5 :6 :7 :8 :9 :10 :Jack :Queen :King :Ace] (range)))

(def suits
  #{:Spades
    :Clubs
    :Diamonds
    :Hearts})

;;Define deck of 52 playing cards from ranks and suites
(defn deck)



(defn card-of [name suit])

(defn hand-values [hand])

(defn high-value [hand-vals])

(defn low-value [hand-vals])


;;HANDS
(defn high-card? [hand])
(defn one-pair? [hand])
(defn two-pairs? [hand])
(defn three-of-a-kind? [hand])
(defn straight? [hand])
(defn flush? [hand])
(defn full-house? [hand])
(defn four-of-a-kind? [hand])
(defn straight-flush? [hand])
(defn royal-flush? [hand])

;;SCORES
(defn high-card-score [hand])
(defn one-pair-score [hand])
(defn two-pairs-score [hand])
(defn three-of-a-kind-score [hand])
(defn straight-score [hand])
(defn flush-score [hand])
(defn full-house-score [hand])
(defn four-of-a-kind-score [hand])
(defn straight-flush-score [hand])
(defn royal-flush-score [hand])

(defn compute-score [hand])





