package com.example.modelviewpresenter.rxlava

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.observables.ConnectableObservable


fun main() {
    val hot = createHotObs()
    hot.subscribe {
        println("value = $it")
    }

    Thread.sleep(1000)

    hot.subscribe {
        println("second = $it")
    }
    hot.connect()

}

fun createHotObs(): ConnectableObservable<Int> =
    Observable.just(12, 312, 13, 12)
        .replay()
