package com.example.artinstituteofchicagoapi.data.model.products


import com.google.gson.annotations.SerializedName

data class DataModel(
    @SerializedName("api_link")
    val apiLink: String? = "",
    @SerializedName("api_model")
    val apiModel: String? = "",
    @SerializedName("artist_ids")
    val artistIds: List<Int?>? = listOf(),
   // @SerializedName("artwork_ids")
    //val artworkIds: String = "",
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("exhibition_ids")
    val exhibitionIds: List<String>? = listOf(),
    @SerializedName("external_sku")
    val externalSku: Int? = 0,
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("image_url")
    val imageUrl: String? = "",
    @SerializedName("max_compare_at_price")
    val maxCompareAtPrice: Int? = 0,
    @SerializedName("max_current_price")
    val maxCurrentPrice: Double? = 0.0,
    @SerializedName("min_compare_at_price")
    val minCompareAtPrice: Int? = 0,
    @SerializedName("min_current_price")
    val minCurrentPrice: Double? = 0.0,
    @SerializedName("price_display")
    val priceDisplay: String? = "",
    @SerializedName("source_updated_at")
    val sourceUpdatedAt: String? = "",
    @SerializedName("timestamp")
    val timestamp: String? = "",
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("updated_at")
    val updatedAt: String? = "",
    @SerializedName("web_url")
    val webUrl: String? = ""
):java.io.Serializable