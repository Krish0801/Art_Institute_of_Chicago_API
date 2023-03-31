package com.example.artinstituteofchicagoapi.ui.events

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.artinstituteofchicagoapi.data.model.events.EventsModel
import com.example.artinstituteofchicagoapi.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val events = MutableLiveData<EventsModel>()

    fun getEvents() {

        viewModelScope.launch {
            val result = repository.getEvents()
            events.postValue(result)
        }

    }

}