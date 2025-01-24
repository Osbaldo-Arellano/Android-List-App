package com.example.affirmations.model

import androidx.annotation.StringRes

data class Course(
    @StringRes val title: Int,
    @StringRes val department: Int,
    val number: Int,
    val capacity: Int
)