package com.example.modelviewpresenter

import io.reactivex.rxjava3.core.Completable
import java.lang.Exception

fun main(){

    saveCompletable("email.com")
        .subscribe{
            println("Completable")
        }

}

private fun saveCompletable(email:String) = Completable.create{emitter->
    try {
        saveBD(email)
        emitter.onComplete()
    }catch (e:Exception){
        emitter.onError(e)


    }
}

private fun saveBD(email:String){
    Thread.sleep(1000L)
    println("save: $email")

}