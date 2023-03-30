package com.example.artinstituteofchicagoapi.data.model.tours


import com.google.gson.annotations.SerializedName

data class PaginationModel(
    @SerializedName("current_page")
    val currentPage: Int? = 0,
    @SerializedName("limit")
    val limit: Int? = 0,
    @SerializedName("next_url")
    val nextUrl: String? = "",
    @SerializedName("offset")
    val offset: Int? = 0,
    @SerializedName("total")
    val total: Int? = 0,
    @SerializedName("total_pages")
    val totalPages: Int? = 0
)