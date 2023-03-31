package com.example.artinstituteofchicagoapi.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.data.model.events.DataModel
import com.example.artinstituteofchicagoapi.data.model.events.EventsModel
import com.example.artinstituteofchicagoapi.databinding.FragmentEventsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EventsFragment : Fragment() {

    private lateinit var viewModel: EventsViewModel
    private var _binding: FragmentEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel =
            ViewModelProvider(this)[EventsViewModel::class.java]
        _binding = FragmentEventsBinding.inflate(inflater, container, false)

        viewModel.events.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getEvents()

        return binding.root
    }

    private fun setupUI(events: EventsModel) {
        val eventsAdapter = EventsAdapter(events.data as List<DataModel>?)
        binding.rvEvents.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = eventsAdapter
        }
        eventsAdapter.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("EventsItem", it)
            }
            findNavController().navigate(
                R.id.action_navigation_events_to_navigation_eventsDetails, bundle
            )
        }

    }

}