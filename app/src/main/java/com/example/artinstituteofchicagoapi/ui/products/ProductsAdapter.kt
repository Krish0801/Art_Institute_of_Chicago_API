package com.example.artinstituteofchicagoapi.ui.products

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.data.model.products.DataModel
import com.example.artinstituteofchicagoapi.databinding.ItemProductsBinding

class ProductsAdapter(val products: List<DataModel>?) :
    RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    var onItemClick: ((DataModel) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemProductsBinding.bind(view)

        fun handleData(item: DataModel?) {
            binding.productsId.text = item?.id.toString()
            binding.productsTitle.text = item?.title.toString()
            binding.productsWebURL.text = item?.webUrl.toString()
        }

    }

    // Creates the ITEM/ROW for the UI
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsAdapter.ViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_products, parent, false)

        return ViewHolder(view)
    }

    // Size of the list
    override fun getItemCount(): Int = products?.size ?: 0

    // Handle the CURRENT item you are on
    override fun onBindViewHolder(holder: ProductsAdapter.ViewHolder, position: Int) {
        holder.handleData(products?.get(position))
        holder.itemView.setOnClickListener {
            products?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }
}