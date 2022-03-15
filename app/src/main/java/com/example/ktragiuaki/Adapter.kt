package com.example.ktragiuaki

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Array

class Adapter(private val dataSet: List<Data>)
    : RecyclerView.Adapter<Adapter.ViewHolderItem>() {

    inner class ViewHolderItem(view: View) : RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.cap)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, null)
        return ViewHolderItem(view)
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        val item = dataSet[position]
        holder.name.text = item.thanhpho.toString()

//            holder.bgr.setBackgroundResource(tinh[])
    }
    override fun getItemCount() : Int = dataSet.size

}

