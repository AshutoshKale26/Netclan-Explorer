package com.example.netclanexplorer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class explore_servises : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_servises)

        val textView = findViewById<TextView>(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView3)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val itemList = generateDummyData()
        val adapter = ServiceAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        textView.setOnClickListener {
            // Open the new activity when the text view is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        textView2.setOnClickListener {
            // Open the new activity when the text view is clicked
            val intent = Intent(this, activity_explore_Buissinesses::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun generateDummyData(): List<ServiceItemData> {
        val dummyList = mutableListOf<ServiceItemData>()
        for (i in 1..10) {
            dummyList.add(
                ServiceItemData(
                    "User $i",
                    "Location $i | Distance $i KM ",
                    "$i km",
                    "Profile Score $i%",
                    "Profession $i",
                    "Years of Experience $i",
                    "Description $i"
                )
            )
        }
        return dummyList
    }
}