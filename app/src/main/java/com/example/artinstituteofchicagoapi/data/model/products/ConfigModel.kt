package com.example.artinstituteofchicagoapi.data.model.products


import com.google.gson.annotations.SerializedName

data class ConfigModel(
    @SerializedName("iiif_url")
    val iiifUrl: String? = "",
    @SerializedName("website_url")
    val websiteUrl: String? = ""
)