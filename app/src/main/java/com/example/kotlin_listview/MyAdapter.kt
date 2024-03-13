package com.example.kotlin_listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context,R.layout.singlelistitem,arrayList)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.singlelistitem,null)

        val image = view.findViewById<ImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.userName)
        val lastMsg = view.findViewById<TextView>(R.id.userDesc)
        val lastSeen = view.findViewById<TextView>(R.id.lastSeen)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        lastSeen.text = arrayList[position].lastSeen
        image.setImageResource(arrayList[position].imageId)

        return view
    }

}