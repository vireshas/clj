(ns api.core
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [api.app :only [app]])
  (:use [ring.util.servlet :only [defservice]]))

(defservice app)

