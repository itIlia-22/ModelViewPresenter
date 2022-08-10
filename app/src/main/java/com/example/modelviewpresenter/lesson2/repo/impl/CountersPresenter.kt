package com.example.modelviewpresenter.lesson2.repo.impl

import com.example.modelviewpresenter.lesson2.view.GithubRepo
import com.example.modelviewpresenter.lesson2.view.MainViewUser
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class CountersPresenter(
    private val repository: GithubRepo,
    private val route: Router

) : MvpPresenter<MainViewUser>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.initList(repository.getUsers())
    }

    fun onBack():Boolean{
        route.exit()
        return true

    }




}