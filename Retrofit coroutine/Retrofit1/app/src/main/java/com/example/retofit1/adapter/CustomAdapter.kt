package com.example.retofit1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retofit1.R
import com.example.retofit1.model.Post

class CustomAdapter(private val dataSet: ArrayList<Post>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.textView)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.test_row_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.textView.text = dataSet[position].title
    }
    override fun getItemCount(): Int {
        return dataSet.size
    }
}