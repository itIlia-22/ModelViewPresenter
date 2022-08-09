package com.example.modelviewpresenter

import com.example.modelviewpresenter.utils.*

class CountersPresenter(
    private val view: MainView,

    ) {



    private val model = CountersModel()


    fun clickBtnOne() {
        view.setTextOne(model.next(ZERO_P).toString())

    }

    fun clickBtnTwo() {
        view.setTextTwo(model.next(ONE_P).toString())

    }

    fun clickBtnThree() {
        view.setTextThree(model.next(Two_P).toString())

    }


}