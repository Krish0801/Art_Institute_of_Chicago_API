package com.example.artinstituteofchicagoapi.data.model.artworks


import com.google.gson.annotations.SerializedName

data class ThumbnailModel(
    @SerializedName("alt_text")
    val altText: String? = "",
    @SerializedName("height")
    val height: Int? = 0,
    @SerializedName("lqip")
    val lqip: String? = "",
    @SerializedName("width")
    val width: Int? = 0
)