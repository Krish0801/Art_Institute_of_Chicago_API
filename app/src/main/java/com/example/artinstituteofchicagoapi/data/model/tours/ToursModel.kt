package com.example.artinstituteofchicagoapi.data.model.tours


import com.google.gson.annotations.SerializedName

data class ToursModel(
    @SerializedName("config")
    val config: ConfigModel? = ConfigModel(),
    @SerializedName("data")
    val `data`: List<DataModel?>? = listOf(),
    @SerializedName("info")
    val info: InfoModel? = InfoModel(),
    @SerializedName("pagination")
    val pagination: PaginationModel? = PaginationModel()
)