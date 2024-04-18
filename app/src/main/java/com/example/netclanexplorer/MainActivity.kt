package com.example.netclanexplorer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val refine: ImageView = findViewById(R.id.imageView2)
        val textView1: TextView = findViewById(R.id.textView2)
        val textView2: TextView = findViewById(R.id.textView3)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val addView: ImageView = findViewById(R.id.add)

        val itemList = generateDummyData()
        val adapter = CustomAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        addView.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


        textView1.setOnClickListener {
            // Open the new activity when the text view is clicked
            val intent = Intent(this, explore_servises::class.java)
            startActivity(intent)
            finish()
        }

        textView2.setOnClickListener {
            // Open the new activity when the text view is clicked
            val intent = Intent(this, activity_explore_Buissinesses::class.java)
            startActivity(intent)
            finish()
        }

        refine.setOnClickListener{
            val intent = Intent(this, Refine::class.java)
            startActivity(intent)

        }
    }

    private fun generateDummyData(): List<ItemData> {
        val dummyList = mutableListOf<ItemData>()
        for (i in 1..10) {
            dummyList.add(
                ItemData(
                    "User $i",
                    "Location $i | Work $i",
                    "$i km",
                    "Profile Score $i%",
                    "Description $i"
                )
            )
        }
        return dummyList
    }
}