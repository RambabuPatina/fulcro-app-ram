(ns app.centersectionheader
  (:require
   ["@fuegokit/react/lib/components/GettingStartedPage/CenteredSectionHeader" :default CenteredSectionHeader]
   [com.fulcrologic.fulcro.algorithms.react-interop :as react-interop]))

(def ui-center-section-header (react-interop/react-factory CenteredSectionHeader))