(ns app.spacer
  (:require
   ["@fuegokit/react/lib/components/Spacer" :default Spacer] 
   [com.fulcrologic.fulcro.algorithms.react-interop :as react-interop]))

(def ui-spacer (react-interop/react-factory Spacer))