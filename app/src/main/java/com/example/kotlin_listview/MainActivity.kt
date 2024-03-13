package com.example.kotlin_listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listView1)

        val next = findViewById<Button>(R.id.nxtButton)

        val taskList = arrayListOf<String>()
        taskList.add("Attend exam")
        taskList.add("Buy food")
        taskList.add("Go to work")
        taskList.add("watch IPL")
        taskList.add("eat food")

        val adapterList = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listView.adapter = adapterList

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked on item:" + (view as TextView).text.toString()
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }

        next.setOnClickListener {
            val intent = Intent(this,ListView2::class.java)
            startActivity(intent)
        }
    }
}