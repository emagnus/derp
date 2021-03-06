(ns derp.server
  (:require [noir.server :as server]
            [derp.views]))

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "1337"))]
    (server/start port {:mode mode
                        :ns 'derp})))