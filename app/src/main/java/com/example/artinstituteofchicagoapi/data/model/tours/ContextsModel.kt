package com.example.artinstituteofchicagoapi.data.model.tours


import com.google.gson.annotations.SerializedName

data class ContextsModel(
    @SerializedName("groupings")
    val groupings: List<String?>? = listOf()
)