package com.example.githublist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var tvUser: TextView
    private lateinit var tvLocation: TextView
    private lateinit var tvFollowers: TextView
    private lateinit var tvFollowing: TextView
    private lateinit var tvCompany: TextView
    private lateinit var tvRepository: TextView
    private lateinit var tvImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val data = intent.getParcelableExtra<UserGit>("Data")
        tvImage = findViewById(R.id.userImage)
        tvUser = findViewById(R.id.userName)
        tvLocation = findViewById(R.id.userLocation)
        tvCompany = findViewById(R.id.userCompany)
        tvFollowers = findViewById(R.id.userFollowers)
        tvFollowing = findViewById(R.id.userFollowing)
        tvRepository = findViewById(R.id.userRepository)
        tvUser.text = data?.name.toString()
        if (data != null) {
            tvImage.setImageDrawable(getDrawable(data.photo))
        }
        tvLocation.text = data?.location.toString()
        tvCompany.text = data?.Company.toString()
        tvFollowing.text = data?.following.toString()
        tvFollowers.text = data?.followers.toString()
        tvRepository.text = data?.repository.toString()
    }
}