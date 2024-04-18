package com.example.netclanexplorer

// ServiceAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ServiceAdapter(private val itemList: List<ServiceItemData>) : RecyclerView.Adapter<ServiceAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.service_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.userNameTextView.text = item.userName
        holder.locationTextView.text = item.location
        holder.profileScoreTextView.text = item.profileScore
        holder.professionTextView.text = item.profession
        holder.descriptionTextView.text = item.description
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userNameTextView: TextView = itemView.findViewById(R.id.userNameTextView2)
        val locationTextView: TextView = itemView.findViewById(R.id.locationTextView2)

        val profileScoreTextView: TextView = itemView.findViewById(R.id.profileScoreTextView2)
        val professionTextView: TextView = itemView.findViewById(R.id.professionTextView2)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView2)
    }
}
