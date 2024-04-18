package com.example.netclanexplorer

// CustomAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val itemList: List<ItemData>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.personal_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.userNameTextView.text = item.userName
        holder.locationWorkTextView.text = item.locationWork
        holder.distanceTextView.text = item.distance
        holder.profileScoreTextView.text = item.profileScore
        holder.descriptionTextView.text = item.description
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userNameTextView: TextView = itemView.findViewById(R.id.userNameTextView)
        val locationWorkTextView: TextView = itemView.findViewById(R.id.locationWorkTextView)
        val distanceTextView: TextView = itemView.findViewById(R.id.distanceTextView)
        val profileScoreTextView: TextView = itemView.findViewById(R.id.profileScoreTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    }
}

