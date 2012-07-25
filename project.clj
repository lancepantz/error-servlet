(defproject error-servlet "0.1.0"
  :description "A servlet that always throws 500 errors. Used to bind to '/' in a container, changing the default 404's into 500's"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clj-json "0.5.1"]
                 [ring/ring-servlet "1.1.1"]
                 [org.clojure/tools.logging "0.2.3"]
                 [log4j/log4j "1.2.17"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler error-servlet.core/handler}
  :main error-servlet.core)
