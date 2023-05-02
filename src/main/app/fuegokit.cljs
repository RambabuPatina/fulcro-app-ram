(ns app.fuegokit
  (:require
   ["@fuegokit/react" :as fuegokit]
   [com.fulcrologic.fulcro.algorithms.react-interop :as react-interop]))

(def ui-box (react-interop/react-factory fuegokit/Box))