(ns income-comparison.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [income-comparison.core-test]))

(doo-tests 'income-comparison.core-test)
