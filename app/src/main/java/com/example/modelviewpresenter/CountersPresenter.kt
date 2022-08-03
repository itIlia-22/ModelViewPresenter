package com.example.modelviewpresenter

import com.example.modelviewpresenter.utils.*

class CountersPresenter(
    private val view: MainView,

    ) {



    private val model = CountersModel()

    // 1 вариант
    fun ClickBtnOne() {
        view.setText(model.next(ZERO_P).toString(), ZERO_P)

    }

    fun ClickBtnTwo() {
        view.setText(model.next(ONE_P).toString(), ONE_P)

    }

    fun ClickBtnThree() {
        view.setText(model.next(Two_P).toString(), Two_P)

    }
// 2 вариант
    fun ClickBtn(id:Int) {
        when(id){
           BTN_ONE -> {
                view.setText(model.next(ZERO_P).toString(), ZERO_P)
            }
           BTN_TWO -> {
                view.setText(model.next(ZERO_P).toString(), ZERO_P)
            }
           BTN_THREE -> {
                view.setText(model.next(ZERO_P).toString(), ZERO_P)
            }

        }

    }


}