package com.example.modelviewpresenter

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import java.lang.Exception

private val dataF = listOf<String>("Vse Okey", "Ne okey")

fun main() {

    saveCompletable("email.com")
        .andThen(newNews())
        .subscribe({
            println("Single subscribe")
            println(it)
        }, {
            println(it.message)
        })

}

private fun newNews() = Single.create<List<String>> { emitter ->
    try {
        val result = dataF
        emitter.onSuccess(result)


    } catch (e: Exception) {
        emitter.onError(e)

    }
}

private fun saveCompletable(email: String) = Completable.create { emitter ->
    try {
        saveBD(email)
        emitter.onComplete()
    } catch (e: Exception) {
        emitter.onError(e)


    }
}

private fun saveBD(email: String) {
    Thread.sleep(1000L)
    println("save: $email")

}