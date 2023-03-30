package com.example.artinstituteofchicagoapi.data.model.artworks


import com.google.gson.annotations.SerializedName

data class SuggestAutocompleteAllModel(
    @SerializedName("contexts")
    val contexts: ContextsModel? = ContextsModel(),
    @SerializedName("input")
    val input: List<String?>? = listOf(),
    @SerializedName("weight")
    val weight: Int? = 0
)