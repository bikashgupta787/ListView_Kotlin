package com.example.kotlin_listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ListView2 : AppCompatActivity() {

    lateinit var userArrayList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view2)

        val name = arrayListOf("MS Dhoni","Virat Kohli","Rohit Sharma","KL Rahul","Ravindra Jadeja")

        val lastMsg = arrayListOf("Captain Cool","King Kohli","Hitman Sharma","Klass KL","Sir Jadeja")

        val lastSeen = arrayListOf("19:49","18:18","16:45","01:10","07:08")

        val phoneNumber = arrayListOf("987632027","735382262","082628282","872578282","8997250273")

        val imgId = intArrayOf(R.drawable.mahi, R.drawable.kohli,R.drawable.rohit,R.drawable.klrahul,R.drawable.jaddu)

        userArrayList = ArrayList()

        for (eachIndex in name.indices){
            val user  = User(name[eachIndex],lastMsg[eachIndex],lastSeen[eachIndex],phoneNumber[eachIndex],imgId[eachIndex])
            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView2)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener { adapterView, view, i, l ->

            val userName = name[i]
            val phone = phoneNumber[i]
            val imgId = imgId[i]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",userName)
            i.putExtra("phone",phone)
            i.putExtra("imgId",imgId)
            startActivity(i)
        }
    }
}