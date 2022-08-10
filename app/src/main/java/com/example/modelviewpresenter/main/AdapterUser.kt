package com.example.modelviewpresenter.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modelviewpresenter.R
import com.example.modelviewpresenter.lesson2.model.GithubUser

class AdapterUser() :
    RecyclerView.Adapter<GithubUserViewHolder>() {
     var user: List<GithubUser> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    set(value){
        field = value
       notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return GithubUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: GithubUserViewHolder, position: Int) {
        holder.bind(user[position])
    }

    override fun getItemCount(): Int = user.size

}

class GithubUserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val uLogin by lazy {
        itemView.findViewById<TextView>(R.id.tvUserLogin)
    }

    fun bind(item: GithubUser) = with(item) {
        uLogin.text = login
    }

}