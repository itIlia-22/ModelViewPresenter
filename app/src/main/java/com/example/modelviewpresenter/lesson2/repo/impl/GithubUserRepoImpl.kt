package com.example.modelviewpresenter.lesson2.repo.impl

import com.example.modelviewpresenter.lesson2.model.GithubUser
import com.example.modelviewpresenter.lesson2.view.GithubRepo

class GithubUserRepoImpl:GithubRepo {
    private val repo = listOf(
        GithubUser("Vovka"),
        GithubUser("Alisa"),
        GithubUser("Liza"),
        GithubUser("Ivan"),
        GithubUser("Moscow")
    )


    override fun getUsers(): List<GithubUser> {
        return repo
    }
}