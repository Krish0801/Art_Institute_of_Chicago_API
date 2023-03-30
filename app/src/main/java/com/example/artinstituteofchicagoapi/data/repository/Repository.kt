package com.example.artinstituteofchicagoapi.data.repository

import com.example.artinstituteofchicagoapi.data.model.artworks.ArtworksModel
import com.example.artinstituteofchicagoapi.data.model.events.EventsModel
import com.example.artinstituteofchicagoapi.data.model.products.ProductsModel
import com.example.artinstituteofchicagoapi.data.model.tours.ToursModel

interface Repository {

    suspend fun getArtworks(): ArtworksModel

    suspend fun getProducts(): ProductsModel

    suspend fun getTours(): ToursModel

    suspend fun getEvents(): EventsModel


}