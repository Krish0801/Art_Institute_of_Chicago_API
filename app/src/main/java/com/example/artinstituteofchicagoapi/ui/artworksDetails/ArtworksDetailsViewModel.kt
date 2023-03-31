package com.example.artinstituteofchicagoapi.ui.artworksDetails

import androidx.lifecycle.ViewModel
import com.example.artinstituteofchicagoapi.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ArtworksDetailsViewModel @Inject constructor(
    repository: Repository
): ViewModel() {

}