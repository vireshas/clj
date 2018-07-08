(ns api.app
  (:require [ring.middleware.params :as params]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.util.response :refer [response]])
  (:require [compojure.core :refer :all]))

(defroutes main-routes
  (GET "/" [] (response {:foo "bar"})))


(def app
  (-> main-routes
      wrap-json-response))
