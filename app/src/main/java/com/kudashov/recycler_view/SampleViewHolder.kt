package com.kudashov.recycler_view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val string: TextView = view.findViewById(R.id.string)

    fun bind(string: String) {
        this.string.text = string
    }
}