package com.example.artinstituteofchicagoapi.data.remote

import com.example.artinstituteofchicagoapi.data.model.artworks.ArtworksModel
import com.example.artinstituteofchicagoapi.data.model.events.EventsModel
import com.example.artinstituteofchicagoapi.data.model.products.ProductsModel
import com.example.artinstituteofchicagoapi.data.model.tours.ToursModel
import retrofit2.http.GET

interface ApiRequest {

    @GET(ApiDetails.ARTWORKS_URL)
    suspend fun getArtworks() : ArtworksModel

    @GET(ApiDetails.PRODUCTS_URL)
    suspend fun getProducts() : ProductsModel

    @GET(ApiDetails.TOURS_URL)
    suspend fun getTours() : ToursModel

    @GET(ApiDetails.EVENTS_URL)
    suspend fun getEvents() : EventsModel
}