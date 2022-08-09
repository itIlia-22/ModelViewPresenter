package com.example.modelviewpresenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.modelviewpresenter.databinding.ActivityMainBinding
import com.example.modelviewpresenter.utils.KEY_STATE
import com.example.modelviewpresenter.utils.ONE_P
import com.example.modelviewpresenter.utils.Two_P
import com.example.modelviewpresenter.utils.ZERO_P
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {
    private lateinit var binding: ActivityMainBinding
    private val model by lazy { CountersModel() }
    private val presenter by moxyPresenter { CountersPresenter(model) }

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


    override fun setTextOne(counter: String) {
        binding.textOne.text = counter
    }

    override fun setTextTwo(counter: String) {
        binding.textTwo.text = counter
    }

    override fun setTextThree(counter: String) {
        binding.textThree.text = counter
    }


}