package com.example.artinstituteofchicagoapi.data.model.tours


import com.google.gson.annotations.SerializedName

data class DataModel(
    @SerializedName("api_link")
    val apiLink: String? = "",
    @SerializedName("api_model")
    val apiModel: String? = "",
    @SerializedName("artist_titles")
    val artistTitles: List<String?>? = listOf(),
    @SerializedName("artwork_titles")
    val artworkTitles: List<String?>? = listOf(),
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("image")
    val image: String? = "",
    @SerializedName("intro")
    val intro: String? = "",
//    @SerializedName("intro_link")
//    val introLink: AnyModel? = AnyModel(),
    @SerializedName("intro_transcript")
    val introTranscript: String? = "",
//    @SerializedName("source_updated_at")
//    val sourceUpdatedAt: AnyModel? = AnyModel(),
    //@SerializedName("suggest_autocomplete_all")
   // val suggestAutocompleteAll: SuggestAutocompleteAllModel? = SuggestAutocompleteAllModel(),
    @SerializedName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = "",
    @SerializedName("timestamp")
    val timestamp: String? = "",
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("updated_at")
    val updatedAt: String? = "",
//    @SerializedName("weight")
//    val weight: AnyModel? = AnyModel()
):java.io.Serializable