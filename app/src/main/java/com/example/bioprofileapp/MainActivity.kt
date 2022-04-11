package com.example.bioprofileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private val attributeList = arrayListOf("hardworking", "lazy", "somewhat lazy", "very lazy", "dedicated")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTxt: TextView= findViewById(R.id.randomstory)
        val randomBtn: Button= findViewById(R.id.rdmbutton)

        randomBtn.setOnClickListener {
           val random = Random
            val randomText = random.nextInt(attributeList.count())
            editTxt.text = attributeList[randomText]

        }
    }
}
