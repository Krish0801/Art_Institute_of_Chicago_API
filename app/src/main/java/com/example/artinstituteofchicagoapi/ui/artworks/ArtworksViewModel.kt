package com.example.artinstituteofchicagoapi.ui.artworks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.artinstituteofchicagoapi.data.model.artworks.ArtworksModel
import com.example.artinstituteofchicagoapi.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ArtworksViewModel @Inject constructor(
    val repository: Repository
): ViewModel() {

    val artworks = MutableLiveData<ArtworksModel>()

    fun getArtworks() {

        viewModelScope.launch {
            val result = repository.getArtworks()
            artworks.postValue(result)
        }

    }
}