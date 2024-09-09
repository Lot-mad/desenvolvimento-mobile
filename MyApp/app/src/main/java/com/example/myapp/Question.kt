package com.example.myapp
import androidx.annotation.StringRes
data class Question(
    @StringRes val textResId: int,
    val answer: Boolean
)
