package com.example.artinstituteofchicagoapi.ui.tours

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.artinstituteofchicagoapi.data.model.tours.ToursModel
import com.example.artinstituteofchicagoapi.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ToursViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val tours = MutableLiveData<ToursModel>()

    fun getTours() {

        viewModelScope.launch {
            val result = repository.getTours()
            tours.postValue(result)
        }

    }
}