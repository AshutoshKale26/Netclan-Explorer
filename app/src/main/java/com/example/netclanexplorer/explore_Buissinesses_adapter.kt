package com.example.netclanexplorer

// CustomAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExploreBusinessesAdapter(private val itemList: List<itemdata_Businesses>) : RecyclerView.Adapter<ExploreBusinessesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.businesses_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.userNameTextView.text = item.userName
        holder.locationTextView.text = item.location
        holder.profileScoreTextView.text = item.profileScore
        holder.descriptionTextView.text = item.description
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userNameTextView: TextView = itemView.findViewById(R.id.userNameTextView3)
        val locationTextView: TextView = itemView.findViewById(R.id.locationTextView3)
        val profileScoreTextView: TextView = itemView.findViewById(R.id.profileScoreTextView3)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView3)
    }
}
