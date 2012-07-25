(ns error-servlet.core
  (:require [clj-json.core :refer [generate-string]]
            [clojure.tools.logging :refer [error]]
            [ring.util.servlet :refer [defservice]])
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defn handler [req]
  (error "Context Missing:" (:uri req))
  {:status  500
   :headers {"Content-Type" "application/json"}
   :body    (generate-string {:message "no context deployed to fulfill this request"
                              :uri (:uri req)})})

(defservice handler)