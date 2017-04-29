(defproject clojure-stack "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.7.0-beta1"]
                 [org.clojure/clojurescript "0.0-3208"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.omcljs/om "0.8.8"]]

  :plugins [[lein-cljsbuild "1.0.5"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/clojure_stack" "out/clojure_stack.js"]

  :cljsbuild {
    :builds [{:id "clojure-stack"
              :source-paths ["src"]
              :compiler {
                :main clojure-stack.core
                :output-to "out/clojure_stack.js"
                :output-dir "out"
                :optimizations :none
                :verbose true}}]})
