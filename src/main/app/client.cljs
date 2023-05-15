(ns app.client
  (:require
   [com.fulcrologic.fulcro.application :as app]
   [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
   [com.fulcrologic.fulcro.dom :as dom]
   ;;["react" :as react]
   ;;["@fuegokit/react" :as fuegokit]
   ;;[app.victory :as victory]
   ;;[app.lozenge :as lozenge]
   [app.fuegokit :as fuegokit]
   [app.spacer :as spacer]
   [app.centersectionheader :as centersectionheader]
   ))

(defonce app (app/fulcro-app))

(defsc Root [this _]
  (dom/div
   (dom/h1 " Get started")
   (dom/p "In our documentation we explain exactly how you can get the most out of the app.")
   ;;(victory/ui-victory-bar )
   ;;(fuegokit/ui-box "TEST" nil))
   (fuegokit/ui-box {:sx
                     #js
                      {:border "1px dashed", :borderColor "tomato", :borderRadius "3px", :p 4}}
"my box")
   ;;(spacer/ui-spacer {:axis "vertical", :size 44})
   ;;(dom/h2 " After Spacer")
   ;;(centersectionheader/ui-center-section-header
                     ;;{:description "Most JSU Automation Suite users found these useful.",
                     ;; :heading "Popular use cases",
                     ;; :variant "TwoLine"})
                      ;;(spacer/ui-spacer {:axis "vertical", :size 44}))
                    ;;(centersectionheader/ui-center-section-header
                    ;; {:description "Most JSU Automation Suite users found these useful.",
                    ;;  :heading "Popular use cases",
                    ;;  :variant "TwoLine"})
                    ;;)
   ;;(fuegokit/ui-atlaslozenge {:appearance "success"} "TEST")
   ;;(lozenge/ui-lozenge {:appearance "success"} "TEST")
   ))

(defn ^:export init
  "Shadow-cljs sets this up to be our entry-point function. See shadow-cljs.edn `:init-fn` in the modules of the main build."
  []
  (app/mount! app Root "app")
  (js/console.log "Loaded"))

(defn ^:export refresh
  "During development, shadow-cljs will call this on every hot reload of source. See shadow-cljs.edn"
  []
  ;; re-mounting will cause forced UI refresh, update internals, etc.
  (app/mount! app Root "app")
  ;; As of Fulcro 3.3.0, this addition will help with stale queries when using dynamic routing:
  (comp/refresh-dynamic-queries! app)
  (js/console.log "Hot reload"))