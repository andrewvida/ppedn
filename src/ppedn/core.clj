(ns ppedn.core
 [:use [clojure.pprint]] [:gen-class])

(defn -main [& args]
  (let [edn (read-string (slurp *in*))]
    (pprint edn)))
