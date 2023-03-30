package com.example.artinstituteofchicagoapi.data.model.tours


import com.google.gson.annotations.SerializedName

data class SuggestAutocompleteAllModel(
    @SerializedName("contexts")
    val contexts: ContextsModel? = ContextsModel(),
    @SerializedName("input")
    val input: List<String?>? = listOf()
)