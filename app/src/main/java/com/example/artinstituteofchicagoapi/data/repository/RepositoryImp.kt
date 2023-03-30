package com.example.artinstituteofchicagoapi.data.repository

import com.example.artinstituteofchicagoapi.data.model.artworks.ArtworksModel
import com.example.artinstituteofchicagoapi.data.remote.ApiRequest
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    val apiRequest: ApiRequest
) : Repository {

    override suspend fun getArtworks() = apiRequest.getArtworks()

    override suspend fun getProducts() = apiRequest.getProducts()

    override suspend fun getTours() = apiRequest.getTours()

    override suspend fun getEvents() = apiRequest.getEvents()


}