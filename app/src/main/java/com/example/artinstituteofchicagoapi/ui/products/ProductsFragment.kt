package com.example.artinstituteofchicagoapi.ui.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.data.model.products.DataModel
import com.example.artinstituteofchicagoapi.data.model.products.ProductsModel
import com.example.artinstituteofchicagoapi.databinding.FragmentProductsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductsFragment : Fragment() {

    private lateinit var viewModel: ProductsViewModel
    private var _binding: FragmentProductsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel =
            ViewModelProvider(this)[ProductsViewModel::class.java]
        _binding = FragmentProductsBinding.inflate(inflater, container, false)

        viewModel.products.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getProducts()

        return binding.root
    }

    private fun setupUI(products: ProductsModel) {
        val productsAdapter = ProductsAdapter(products.data as List<DataModel>?)
        binding.rvProducts.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = productsAdapter
        }
        productsAdapter.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("ProductsItem", it)
            }
            findNavController().navigate(
                R.id.action_navigation_products_to_navigation_productsDetails, bundle
            )
        }

    }
}