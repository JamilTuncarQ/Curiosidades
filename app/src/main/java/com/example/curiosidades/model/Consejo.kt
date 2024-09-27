package com.example.curiosidades.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Consejo(
    @StringRes val tituloId: Int,
    @StringRes val descripcionId: Int,
    @DrawableRes val imagenId: Int
)
