package com.example.modelviewpresenter.lesson2.view

import com.example.modelviewpresenter.lesson2.model.GithubUser
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainViewUser : MvpView {
 fun initList(list: List<GithubUser>)


}