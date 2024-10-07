(defproject ogs-spy "0.1.0-SNAPSHOT"

  :description "Project to manipulate OGS data with clojure"
  :url "https://github.com/rafael-nearshoredev/OGS-spy"

  :dependencies [[clj-http "3.13.0"]
                 [cider/cider-nrepl "0.47.1"]
                 [environ "1.2.0"]
                 [org.clojure/clojure "1.12.0"]
                 [org.clojure/data.json "2.5.0"]
                 [org.clojure/tools.cli "1.1.230"]]

  :min-lein-version "2.0.0"

  :source-paths ["src"]
  :test-paths ["test"]
  :resource-paths ["resources"]
  :target-path "target/%s/"
  :main ^:skip-aot spy.core)
