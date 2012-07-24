(ns error-servlet.core
  (:require [clj-json.core :as json])
  (:use [ring.util.servlet :only [defservice]])
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defn handler [req]
  {:status  500
   :headers {"Content-Type" "text/html"}
   :body    (json/generate-string {:message "no context deployed to fulfill this request"
                                   :uri (:uri req)})})

(defservice handler)