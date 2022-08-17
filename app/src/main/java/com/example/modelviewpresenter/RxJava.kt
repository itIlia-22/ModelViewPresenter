package com.example.modelviewpresenter

import io.reactivex.rxjava3.core.Observable


private val data = listOf(1, 3, 41, 23, 434, 55, 59)
fun main() {

/* Учебный код 1
  val observer = object : Observer<Int> {
            override fun onSubscribe(d: Disposable) = Unit

            override fun onNext(t: Int) {
                println("norm $t")
            }

            override fun onError(e: Throwable) {
                print("Error")
            }

            override fun onComplete() {
                print("Yes")
            }


        }


        val observable = Observable.create<Int> { emitter ->
            try {
                data.forEach { element ->
                    emitter.onNext(element)

                }
            } catch (e: Exception) {
                emitter.onError(e)
            }
            emitter.onComplete()


        }
        observable.subscribe(observer)
 */
/*
Kод, если нужно старый код или проект быстро перевести на RxJava\
 Observable.fromCallable {
        val result = old()
        return@fromCallable result
    }.subscribe{
        println(it)
    }

    fun old(): List<Boolean> {
    Thread.sleep(1000)
    return listOf(true,false,true)

 */

    Observable.fromIterable(data)
        // первые 3 или сколько надо элементов остаются  .take(3)
        //кол-во узказанных элементов скрываюся, то есть скипуются  .skip(2)
        // map - частое явление и увеличивает(+.*) и уменьшает(/.-)
        //можно менять тип
        .map(::AddMapTest)
        .subscribe {
            println(it )
        }


}
private fun AddMapTest(value: Int):List<Int>{
    return listOf(value,8)
}


