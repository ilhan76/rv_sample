package com.kudashov.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var rvAdapter: RvAdapter = RvAdapter()
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: MutableList<String> = ArrayList()
        (1..100).forEach {
            list.add("String $it")
        }
        recyclerView = findViewById(R.id.rv)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = rvAdapter
        rvAdapter.setList(list)
    }
}