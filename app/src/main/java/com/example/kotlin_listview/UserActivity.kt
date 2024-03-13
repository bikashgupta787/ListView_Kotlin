package com.example.kotlin_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("phone")
        val imgId = intent.getIntExtra("imgId",R.drawable.mahi)

        val nameTv = findViewById<TextView>(R.id.tvName)
        val phoneTv = findViewById<TextView>(R.id.tvNumber)
        val imageId = findViewById<ImageView>(R.id.profile_image)

        nameTv.text= name
        phoneTv.text = number
        imageId.setImageResource(imgId)

    }
}