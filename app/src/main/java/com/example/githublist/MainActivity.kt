package com.example.githublist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvUserGit: RecyclerView
    private val list = ArrayList<UserGit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvUserGit = findViewById(R.id.rvUserGit)
        rvUserGit.setHasFixedSize(true)

        list.addAll(listUserGit)
        showRecyclerList()
    }

    private val listUserGit: ArrayList<UserGit>
        get() {
            val dataName = resources.getStringArray(R.array.name)
            val dataCompany = resources.getStringArray(R.array.company)
            val dataLocation = resources.getStringArray(R.array.location)
            val dataFollowers = resources.getStringArray(R.array.followers)
            val dataFollowing = resources.getStringArray(R.array.following)
            val dataRepository = resources.getStringArray(R.array.repository)
            val dataPhoto = resources.obtainTypedArray(R.array.avatar)
            val listUser = ArrayList<UserGit>()
            for (i in dataName.indices) {
                val user = UserGit(dataName[i],dataCompany[i],dataLocation[i],dataPhoto.getResourceId(i, -1),dataFollowers[i],dataFollowing[i],dataRepository[i] )
                listUser.add(user)
            }
            return listUser
        }

    private fun showRecyclerList() {
        rvUserGit.layoutManager = LinearLayoutManager(this)
        val listUserGitAdapter = ListUserGitAdapter(list)
        rvUserGit.adapter = listUserGitAdapter
        listUserGitAdapter.setOnItemClickCallback(object : ListUserGitAdapter.OnItemClickCallback {
            override fun onItemClicked(data: UserGit) {
                val intentDetail = Intent(this@MainActivity,DetailActivity::class.java)
                intentDetail.putExtra("Data",data)
                startActivity(intentDetail)
            }
        })

    }
}