(ns poker.deck)

;;Face values of playing cards, 2 is lowest value, ace is 14
(defn values []
  [:2 :3 :4 :5 :6 :7 :8 :9 :10 :Jack :Queen :King :Ace])

;;Card lands
(defn lands []
  [:Spades :Clubs :Hearts :Diamonds])

;;Define a deck of playing cards from values and lands
(defn deck []
  (for [l (lands) v (values)]
    [v l]))

;;Shuffle the deck
(defn shuffledDeck []
  (shuffle (deck)))

;;Take first 5 cards from shuffled deck
(defn hand []
  (take 5 (shuffledDeck)))



