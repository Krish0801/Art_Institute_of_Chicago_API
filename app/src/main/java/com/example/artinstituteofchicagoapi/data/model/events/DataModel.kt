package com.example.artinstituteofchicagoapi.data.model.events


import com.google.gson.annotations.SerializedName

data class DataModel(
    @SerializedName("alt_audience_ids")
    val altAudienceIds: List<Int?>? = listOf(),
    @SerializedName("alt_event_type_ids")
    val altEventTypeIds: List<Int?>? = listOf(),
    @SerializedName("api_link")
    val apiLink: String? = "",
    @SerializedName("api_model")
    val apiModel: String? = "",
    @SerializedName("audience_id")
    val audienceId: Int? = 0,
    @SerializedName("buy_button_caption")
    val buyButtonCaption: String? = "",
    @SerializedName("buy_button_text")
    val buyButtonText: String? = "",
//    @SerializedName("date_display")
//    val dateDisplay: AnyModel? = AnyModel(),
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("door_time")
    val doorTime: String? = "",
    @SerializedName("end_date")
    val endDate: String? = "",
    @SerializedName("end_time")
    val endTime: String? = "",
    @SerializedName("entrance")
    val entrance: String? = "",
//    @SerializedName("event_host_id")
//    val eventHostId: AnyModel? = AnyModel(),
//    @SerializedName("event_host_title")
//    val eventHostTitle: AnyModel? = AnyModel(),
    @SerializedName("event_type_id")
    val eventTypeId: Int? = 0,
//    @SerializedName("header_description")
//    val headerDescription: AnyModel? = AnyModel(),
    @SerializedName("hero_caption")
    val heroCaption: String? = "",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("image_url")
    val imageUrl: String? = "",
    @SerializedName("is_admission_required")
    val isAdmissionRequired: Boolean? = false,
    @SerializedName("is_after_hours")
    val isAfterHours: Boolean? = false,
    @SerializedName("is_free")
    val isFree: Boolean? = false,
    @SerializedName("is_member_exclusive")
    val isMemberExclusive: Boolean? = false,
    @SerializedName("is_private")
    val isPrivate: Boolean? = false,
    @SerializedName("is_registration_required")
    val isRegistrationRequired: Boolean? = false,
    @SerializedName("is_sold_out")
    val isSoldOut: Boolean? = false,
    @SerializedName("is_ticketed")
    val isTicketed: Boolean? = false,
    @SerializedName("is_virtual_event")
    val isVirtualEvent: Boolean? = false,
//    @SerializedName("join_url")
//    val joinUrl: AnyModel? = AnyModel(),
    @SerializedName("layout_type")
    val layoutType: Int? = 0,
    @SerializedName("list_description")
    val listDescription: String? = "",
    @SerializedName("location")
    val location: String? = "",
    @SerializedName("program_ids")
    val programIds: List<Int?>? = listOf(),
    @SerializedName("program_titles")
    val programTitles: List<String?>? = listOf(),
    @SerializedName("rsvp_link")
    val rsvpLink: String? = "",
//    @SerializedName("search_tags")
//    val searchTags: AnyModel? = AnyModel(),
    @SerializedName("short_description")
    val shortDescription: String? = "",
    @SerializedName("slug")
    val slug: String? = "",
    @SerializedName("source_updated_at")
    val sourceUpdatedAt: String? = "",
    @SerializedName("start_date")
    val startDate: String? = "",
    @SerializedName("start_time")
    val startTime: String? = "",
//    @SerializedName("survey_url")
//    val surveyUrl: AnyModel? = AnyModel(),
    @SerializedName("ticketed_event_id")
    val ticketedEventId: Int? = 0,
    @SerializedName("timestamp")
    val timestamp: String? = "",
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("title_display")
    val titleDisplay: String? = "",
    @SerializedName("updated_at")
    val updatedAt: String? = "",
//    @SerializedName("virtual_event_passcode")
//    val virtualEventPasscode: AnyModel? = AnyModel(),
//    @SerializedName("virtual_event_url")
//    val virtualEventUrl: AnyModel? = AnyModel()
):java.io.Serializable