package com.example.netclanexplorer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class activity_explore_Buissinesses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_buissinesses)

        val textView = findViewById<TextView>(R.id.textView1)
        val textView1 = findViewById<TextView>(R.id.textView2)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val itemList = generateDummyData()
        val adapter = ExploreBusinessesAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        textView.setOnClickListener {
            // Open the new activity when the text view is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        textView1.setOnClickListener {
            // Open the new activity when the text view is clicked
            val intent = Intent(this, explore_servises::class.java)
            startActivity(intent)
            finish()
        }


    }

    private fun generateDummyData(): List<itemdata_Businesses> {
        val dummyList = mutableListOf<itemdata_Businesses>()
        for (i in 1..10) {
            dummyList.add(
                itemdata_Businesses(
                    "User $i",
                    "Location $i",
                    "Profile Score ${i * 10}%","Description $i"

                )
            )
        }
        return dummyList
    }



}
