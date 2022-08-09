package com.example.modelviewpresenter

import androidx.constraintlayout.motion.utils.ViewState
import com.example.modelviewpresenter.utils.*
import moxy.MvpPresenter

class CountersPresenter(
    private val model: CountersModel,
) : MvpPresenter<MainView>() {


    fun clickBtnOne() {
        viewState.setTextOne(model.next(ZERO_P).toString())

    }

    fun clickBtnTwo() {
        viewState.setTextTwo(model.next(ONE_P).toString())

    }

    fun clickBtnThree() {
        viewState.setTextThree(model.next(Two_P).toString())

    }


}