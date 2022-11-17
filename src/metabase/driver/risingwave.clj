;; Define a namespace for the driver
(ns metabase.driver.risingwave
  (:require [metabase.driver :as driver]
            [metabase.driver.sql-jdbc.sync :as sql-jdbc.sync]
))

(driver/register! :risingwave, :parent :postgres)


(defmethod driver/describe-table :risingwave
  [driver database table]
  (sql-jdbc.sync/describe-table driver database table))