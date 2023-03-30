package com.example.artinstituteofchicagoapi.ui.tours

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.databinding.FragmentArtworksBinding
import com.example.artinstituteofchicagoapi.databinding.FragmentToursBinding
import com.example.artinstituteofchicagoapi.ui.artworks.ArtworksViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ToursFragment : Fragment() {

    private var _binding: FragmentToursBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val toursViewModel =
            ViewModelProvider(this).get(ToursViewModel::class.java)

        _binding = FragmentToursBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTours
        toursViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}