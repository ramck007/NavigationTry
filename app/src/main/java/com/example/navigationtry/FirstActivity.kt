package com.example.navigationtry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"
        findViewById<Button>(R.id.firstActivityButton).setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}