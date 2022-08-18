package com.example.modelviewpresenter

import android.util.Log
import com.example.modelviewpresenter.utils.LOG_COMPLETABLE
import com.example.modelviewpresenter.utils.LOG_MAYBE
import com.example.modelviewpresenter.utils.LOG_SINGLE
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Single
import java.lang.Exception
import java.util.*

private val dataF = listOf<String>("Vse Okey", "Ne okey")

fun main() {

    saveCompletable("email.com")
        .andThen(getMaybeService())
        .subscribe({
            println("Single subscribe")
            println(it)
        }, {
            println(it.message)
        },{
            println("Single complete")
        })

}

private fun getMaybeService() = Maybe.create<Boolean>{ emitter ->
    try {
        when(Random().nextInt(2)){
            0 -> emitter.onSuccess(false)
            1 -> emitter.onSuccess(true)
            2 -> emitter.onComplete()
        }

    }catch (e:Exception){
        Log.e(LOG_MAYBE,"eee")
        emitter.onError(e)

    }

}

private fun newNews() = Single.create<List<String>> { emitter ->
    try {
        val result = dataF
        emitter.onSuccess(result)


    } catch (e: Exception) {
        Log.e(LOG_SINGLE,"eee")
        emitter.onError(e)

    }
}

private fun saveCompletable(email: String) = Completable.create { emitter ->
    try {
        saveBD(email)
        emitter.onComplete()
    } catch (e: Exception) {
        Log.e(LOG_COMPLETABLE,"eee")
        emitter.onError(e)


    }
}

private fun saveBD(email: String) {
    Thread.sleep(1000L)
    println("save: $email")

}