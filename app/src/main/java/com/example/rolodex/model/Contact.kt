package com.example.rolodex.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable

data class Contact(val fullName: String, var phoneNumber: String,var email: String = "",
    @DrawableRes val image: Int = 0)





