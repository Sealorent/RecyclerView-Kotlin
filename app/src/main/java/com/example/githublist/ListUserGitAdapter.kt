package com.example.githublist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListUserGitAdapter (private val listUserGit: ArrayList<UserGit>): RecyclerView.Adapter<ListUserGitAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_list , parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,company, location, photo) = listUserGit[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvCompany.text = company
        holder.tvLocation.text = location
    }

    override fun getItemCount(): Int = listUserGit.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.name)
        var tvCompany: TextView = itemView.findViewById(R.id.company)
        var tvLocation: TextView = itemView.findViewById(R.id.location)
    }



}
