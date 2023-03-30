package com.example.artinstituteofchicagoapi.ui.eventsDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.artinstituteofchicagoapi.R

class EventsDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = EventsDetailsFragment()
    }

    private lateinit var viewModel: EventsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_events_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EventsDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}