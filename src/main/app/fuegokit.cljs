(ns app.fuegokit
  (:require
   ["@fuegokit/react" :as fuegokit]
   [com.fulcrologic.fulcro.algorithms.react-interop :as react-interop]))

(def ui-box (react-interop/react-factory fuegokit/Box))
(def ui-global-header (react-interop/react-factory fuegokit/GlobalHeader))
(def ui-global-header-nav (react-interop/react-factory (.-Nav fuegokit/GlobalHeader)))
(def ui-global-header-navtitle (react-interop/react-factory (.-NavTitle fuegokit/GlobalHeader)))
(def ui-getstarted-container (react-interop/react-factory fuegokit/GettingStartedPageGridContainer))
(def ui-maxwidth-wrapper (react-interop/react-factory fuegokit/MaxWidthWrapper))
(def ui-spacer (react-interop/react-factory fuegokit/Spacer))
(def ui-getstarted-stack (react-interop/react-factory fuegokit/GettingStartedStack))
(def ui-pagehero (react-interop/react-factory fuegokit/PageHero))