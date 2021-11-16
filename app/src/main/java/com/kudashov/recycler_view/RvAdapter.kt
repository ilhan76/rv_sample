package com.kudashov.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

class RvAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val list: MutableList<String> = ArrayList()

    fun setList(newList: List<String>){
        list.clear()
        list.addAll(newList)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SampleViewHolder(parent.inflate(R.layout.item))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SampleViewHolder) holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}

fun ViewGroup.inflate(@LayoutRes layoutId: Int) : View {
    return LayoutInflater.from(this.context).inflate(layoutId, this, false)
}
