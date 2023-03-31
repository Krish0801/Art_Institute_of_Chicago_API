package com.example.artinstituteofchicagoapi.ui.tours

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.data.model.tours.DataModel
import com.example.artinstituteofchicagoapi.data.model.tours.ToursModel
import com.example.artinstituteofchicagoapi.databinding.FragmentToursBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ToursFragment : Fragment() {

    private lateinit var viewModel: ToursViewModel
    private var _binding: FragmentToursBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel =
            ViewModelProvider(this)[ToursViewModel::class.java]
        _binding = FragmentToursBinding.inflate(inflater, container, false)

        viewModel.tours.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getTours()

        return binding.root
    }

    private fun setupUI(tours: ToursModel) {
        val toursAdapter = ToursAdapter(tours.data as List<DataModel>?)
        binding.rvTours.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = toursAdapter
        }
        toursAdapter.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("ToursItem", it)
            }
            findNavController().navigate(
                R.id.action_navigation_tours_to_navigation_toursDetails, bundle
            )
        }

    }

}