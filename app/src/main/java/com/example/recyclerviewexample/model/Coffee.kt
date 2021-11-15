package com.example.recyclerviewexample.model

import androidx.annotation.DrawableRes

data class Coffee (
        @DrawableRes val imageResourceId: Int,
        val name: String,
        val description: String
)