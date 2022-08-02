package com.example.modelviewpresenter

import com.example.modelviewpresenter.utils.ONE_P
import com.example.modelviewpresenter.utils.Two_P
import com.example.modelviewpresenter.utils.ZERO_P

class CountersPresenter(
    private val view: MainView,

    ) {

    private val model = CountersModel()
    fun ClickBtnOne() {
        view.setText(model.next(ZERO_P).toString(), ZERO_P)

    }

    fun ClickBtnTwo() {
        view.setText(model.next(ONE_P).toString(), ONE_P)

    }

    fun ClickBtnThree() {
        view.setText(model.next(Two_P).toString(), Two_P)

    }


}