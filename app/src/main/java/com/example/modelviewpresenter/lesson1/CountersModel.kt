package com.example.modelviewpresenter.lesson1

import com.example.modelviewpresenter.utils.ONE_DATA
import com.example.modelviewpresenter.utils.TWO_DATA
import com.example.modelviewpresenter.utils.ZERO_DATA

class CountersModel {

    val counters = mutableListOf(ZERO_DATA, ONE_DATA, TWO_DATA)


    fun getCurrent(position: Int): Int {
        return counters[position]

    }

    fun next(position: Int): Int {
        return counters[position]++
    }

    fun set(position: Int, value: Int) {
        counters[position] = value

    }
}