package com.example.artinstituteofchicagoapi.ui.artworks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.data.model.artworks.ArtworksModel
import com.example.artinstituteofchicagoapi.data.model.artworks.DataModel
import com.example.artinstituteofchicagoapi.databinding.FragmentArtworksBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ArtworksFragment : Fragment() {
    private lateinit var viewModel: ArtworksViewModel
    private var _binding: FragmentArtworksBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel =
            ViewModelProvider(this)[ArtworksViewModel::class.java]
        _binding = FragmentArtworksBinding.inflate(inflater, container, false)

        viewModel.artworks.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getArtworks()

        return binding.root
    }

    private fun setupUI(artworks: ArtworksModel) {
        val artworksAdapter = ArtworksAdapter(artworks.data as List<DataModel>?)
        binding.rvArtworks.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = artworksAdapter
        }
        artworksAdapter.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("ArtworksItem", it)
            }
            findNavController().navigate(
                R.id.action_navigation_artworks_to_navigation_artworksDetails, bundle
            )
        }

    }
}