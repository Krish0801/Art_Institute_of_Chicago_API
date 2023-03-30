package com.example.artinstituteofchicagoapi.ui.artworksDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.data.model.artworks.DataModel
import com.example.artinstituteofchicagoapi.databinding.FragmentArtworksDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ArtworksDetailsFragment : Fragment() {

    private var _binding: FragmentArtworksDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ArtworksDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel =
            ViewModelProvider(this)[ArtworksDetailsViewModel::class.java]
        _binding = FragmentArtworksDetailsBinding.inflate(inflater, container, false)

        val artworks = arguments?.getSerializable("ArtworksItem") as DataModel?

        binding.artworksArtistId.text = artworks?.artistId.toString()
        binding.artworksArtistDisplay.text =artworks?.artistDisplay
        binding.artworksMediumDisplay.text =artworks?.mediumDisplay
        binding.artworksPlaceOfOrigin.text =artworks?.placeOfOrigin
        binding.artworksArtistTitle.text =artworks?.artistTitle
        binding.artworksSubjectId.text =artworks?.subjectId


        return binding.root
    }

}
