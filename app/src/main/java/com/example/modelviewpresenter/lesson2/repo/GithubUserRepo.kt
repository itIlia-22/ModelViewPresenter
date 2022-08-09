package com.example.modelviewpresenter.lesson2.repo

import com.example.modelviewpresenter.lesson2.model.GithubUser

class GithubUserRepo {
    private val repo = listOf(
        GithubUser("Vovka"),
        GithubUser("Alisa"),
        GithubUser("Liza"),
        GithubUser("Ivan"),
        GithubUser("Moscow")
    )

    fun getUser():List<GithubUser>{
        return repo
    }
}