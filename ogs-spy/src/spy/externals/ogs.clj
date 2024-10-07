(ns spy.externals.ogs
  "This namespace objective is fetch information from OGS."
  (:require
   [clj-http.client :as http]
   [clojure.data.json :as json]))


(defonce base-url "https://online-go.com/api/v1")


(defn get-announcements
  "Fetch the latest OGS announcements."
  []
  (let [url (str base-url "/announcements")]
    (-> (http/get url)
        :body
        (json/read-json))))


(defn get-groups
  "Fetch all the groups"
  []
  (let [url (str base-url "/groups")
        {:keys [:next :results]} (-> (http/get url)
                                     :body
                                     (json/read-json))]
    results
    
    
    ))

(comment  

"I want to ping 1 time the api get the results get the number 
 of groups divide it by 10
 make n simultaneus calls to the api get the results filter 
 using the key member_count and only save groups with more than 10 
 user "


(count (get-groups))

  

  )



