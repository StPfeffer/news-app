package com.pfeffer.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.pfeffer.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat",
        image = R.drawable.onboarding3
    ),
)
