package com.example.m3tanetswear.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m3tanetswear.R
import com.example.m3tanetswear.data.model.Outfit

class OutfitAdapter(
    private val dataset: List<Outfit>
) : RecyclerView.Adapter<OutfitAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image = itemView.findViewById<ImageView>(R.id.outfit1_image)
        var price = itemView.findViewById<TextView>(R.id.outfit_price)
        var name = itemView.findViewById<TextView>(R.id.outfit_name)
        var sale = itemView.findViewById<TextView>(R.id.outfit_sale)
    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.outfit_layout, parent, false)
        // das itemLayout wird gebaut


        // und in einem ViewHolder zurückgegeben
        return ItemViewHolder(itemView)
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val outfit = dataset[position]
        holder.image.setImageResource(outfit.imageResource)
        holder.price.text = outfit.price.toString()
        holder.name.text = outfit.name
        if (outfit.sale == true){
            holder.sale.visibility = View.VISIBLE

        } else {

            holder.sale.visibility = View.INVISIBLE

        }



    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return (dataset.size)
    }
}
