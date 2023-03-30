package com.example.artinstituteofchicagoapi.ui.products

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.artinstituteofchicagoapi.data.model.artworks.ArtworksModel
import com.example.artinstituteofchicagoapi.data.model.products.ProductsModel
import com.example.artinstituteofchicagoapi.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val products = MutableLiveData<ProductsModel>()

    fun getProducts() {

        viewModelScope.launch {
            val result = repository.getProducts()
            products.postValue(result)
        }

    }
}