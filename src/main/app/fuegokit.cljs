(ns app.fuegokit
  (:require
   ["@fuegokit/react/lib/components/Box" :default Box]
   ;;["@fuegokit/react/lib/components/AtlasLozenge" :default AtlasLozenge]
   [com.fulcrologic.fulcro.algorithms.react-interop :as react-interop]))

;;(def ui-box (comp/fragment fuegokit/Box))
;;(def ui-atlaslozenge (react-interop/react-factory AtlasLozenge))
(def ui-box (react-interop/react-factory Box))
;;(def ui-text (react-interop/react-factory fuegokit/Text))
;;(def ui-button (react-interop/react-factory fuegokit/Button))
;;(def ui-pagehero (react-interop/react-factory fuegokit/PageHero))