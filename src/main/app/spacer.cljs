(ns app.spacer
  (:require
   ["@fuegokit/react" :as fuegokit] 
   [com.fulcrologic.fulcro.algorithms.react-interop :as react-interop]))

(def ui-spacer (react-interop/react-factory fuegokit/Spacer))