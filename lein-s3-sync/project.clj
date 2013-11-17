(defproject lein-s3-sync "0.2.0"
  :description "Sync local folders to s3"
  :url "http://github.com/kanej/lein-s3-sync"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[me.kanej/s3-sync "0.2.0"]]
  :test-selectors {:default (complement :integration)
                   :integration :integration
                   :all (constantly true)}
  :eval-in-leiningen true
  :min-lein-version "2.0.0")