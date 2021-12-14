package com

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.google.android.material.imageview.ShapeableImageView
import java.util.zip.Inflater

class MyAdapter(private val newslist :ArrayList<News>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val titleImage : ShapeableImageView =itemView.findViewById(R.id.title_image)
        val tvheading : TextView =itemView.findViewById(R.id.tvHeading)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater .from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val  currentItem= newslist[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvheading.text =currentItem.heading
    }

    override fun getItemCount(): Int {
        return newslist.size
    }
}