package com.example.githublist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val myName = resources.getStringArray(R.array.name)
        val company = resources.getStringArray(R.array.company)
        val location = resources.getStringArray(R.array.location)
        val image = resources.getStringArray(R.array.avatar)


    }
}