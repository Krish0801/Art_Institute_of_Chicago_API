package com.example.artinstituteofchicagoapi.ui.toursDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.artinstituteofchicagoapi.R

class ToursDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ToursDetailsFragment()
    }

    private lateinit var viewModel: ToursDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tours_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ToursDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}