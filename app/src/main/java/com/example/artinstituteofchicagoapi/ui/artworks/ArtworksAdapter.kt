package com.example.artinstituteofchicagoapi.ui.artworks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.artinstituteofchicagoapi.R
import com.example.artinstituteofchicagoapi.data.model.artworks.DataModel
import com.example.artinstituteofchicagoapi.databinding.ItemArtworksBinding

class ArtworksAdapter(val artworks: List<DataModel>?) :
    RecyclerView.Adapter<ArtworksAdapter.ViewHolder>() {

    var onItemClick: ((DataModel) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemArtworksBinding.bind(view)

        fun handleData(item: DataModel?) {
            binding.artworksArtistId.text = item?.artistId.toString()
            binding.artworksArtistDisplay.text = item?.artistDisplay
            binding.artworksMediumDisplay.text = item?.mediumDisplay
        }

    }

    // Creates the ITEM/ROW for the UI
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtworksAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_artworks, parent, false)

        return  ViewHolder(view)
    }

    // Size of the list
    override fun getItemCount(): Int = artworks?.size ?: 0

    // Handle the CURRENT item you are on
    override fun onBindViewHolder(holder: ArtworksAdapter.ViewHolder, position: Int) {
        holder.handleData(artworks?.get(position))
        holder.itemView.setOnClickListener {
            artworks?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }
}