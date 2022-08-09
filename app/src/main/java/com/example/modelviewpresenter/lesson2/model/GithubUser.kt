package com.example.modelviewpresenter.lesson2.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GithubUser
    (
    val login: String,
) : Parcelable
