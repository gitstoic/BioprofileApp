package com.example.bioprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val randomBtn: Button = findViewById(R.id.rdmbutton)
        randomBtn.setOnClickListener { randomizer() }
    }

    private fun randomizer() {
        val attributeList =
            arrayListOf("hardworking", "lazy", "somewhat lazy", "very lazy", "dedicated")
        val randomText = attributeList.random()

        val editTxt: TextView = findViewById(R.id.randomstory)
        editTxt.text = randomText
    }
}
