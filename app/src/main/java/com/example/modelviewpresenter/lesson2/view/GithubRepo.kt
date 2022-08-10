package com.example.modelviewpresenter.lesson2.view

import com.example.modelviewpresenter.lesson2.model.GithubUser

interface GithubRepo {
    fun getUsers():List<GithubUser>
}