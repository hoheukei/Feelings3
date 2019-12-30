package com.example.feelings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        feelingViewModel = viewModelProvider(this).get(FeelingViewModel::class.java)

        feelingViewModel.allFeelings.observe{}

        fab.setOnClickListener{
            val intent: Intent = Intent(this,)

        }
    }

    companion object{
        val REQUEST_CODE = 1
    }
}
