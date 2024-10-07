(ns spy.externals.openai
  (:require
   [clj-http.client :as http]
   [environ.core :as environ]))


(defn openai-key
  []
  #_(environ/env :openai-32k-api-key)
  "hola")

(defonce openai-base-url "https://api.openai.com/v1/chat")


(defn openapi-request
  [path body]
  (->> (http/post (str openai-base-url path)
                  {:body (generate-string body)
                   :headers {:content-type "application/json"
                             :Authorization (str "Bearer " (openai-key))}})
       :body))



(comment 

{:model "gpt-4o-mini"
 :temperature 0.8
 :response_format {:type "json_object"}
 :messages [{"role" "user", "content" content}]}

  ) 