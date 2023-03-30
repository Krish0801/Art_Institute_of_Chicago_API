package com.example.artinstituteofchicagoapi.data.model.tours


import com.google.gson.annotations.SerializedName

data class InfoModel(
    @SerializedName("license_links")
    val licenseLinks: List<String?>? = listOf(),
    @SerializedName("license_text")
    val licenseText: String? = "",
    @SerializedName("version")
    val version: String? = ""
)