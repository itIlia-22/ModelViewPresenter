package com.example.modelviewpresenter.main

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modelviewpresenter.databinding.ActivityMainBinding
import com.example.modelviewpresenter.lesson2.core.BackPressedListener
import com.example.modelviewpresenter.lesson2.model.GithubUser
import com.example.modelviewpresenter.lesson2.myApp
import com.example.modelviewpresenter.lesson2.repo.impl.CountersPresenter
import com.example.modelviewpresenter.lesson2.repo.impl.GithubUserRepoImpl
import com.example.modelviewpresenter.lesson2.view.MainViewUser
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainViewUser,BackPressedListener {
    private lateinit var binding: ActivityMainBinding
    private val mAdapter = AdapterUser()
    private val presenter: CountersPresenter by moxyPresenter {
        CountersPresenter(GithubUserRepoImpl(),
            myApp.instance.router)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            RecyclerViewUsers.layoutManager = LinearLayoutManager(this@MainActivity)
            RecyclerViewUsers.adapter = mAdapter
        }


    }

    override fun initList(list: List<GithubUser>) {
        mAdapter.user = list
    }

    override fun onBack(): Boolean = presenter.onBack()


}