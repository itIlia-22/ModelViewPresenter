package com.example.modelviewpresenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewpresenter.databinding.ActivityMainBinding
import com.example.modelviewpresenter.utils.KEY_STATE
import com.example.modelviewpresenter.utils.ONE_P
import com.example.modelviewpresenter.utils.Two_P
import com.example.modelviewpresenter.utils.ZERO_P

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var binding: ActivityMainBinding
    private val model by lazy { CountersModel() }
    private val presenter = CountersPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOne.setOnClickListener {
            presenter.clickBtnOne()
        }
        binding.btnTwo.setOnClickListener {
            presenter.clickBtnTwo()
        }
        binding.btnThree.setOnClickListener {
            presenter.clickBtnThree()
        }


    }

    override fun setText(counter: String, id: Int) {
        when (id) {
            ZERO_P -> binding.textOne.text = counter
            ONE_P -> binding.textTwo.text = counter
            Two_P -> binding.textThree.text = counter
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putIntArray(KEY_STATE, model.counters.toIntArray())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val array = savedInstanceState.getIntArray(KEY_STATE)
        model.counters.let { list ->
            list.clear()
            array?.toList()?.let {
                list.addAll(it)

            }

        }

    }


}