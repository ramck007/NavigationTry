package com.example.navigationtry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val actionBar = supportActionBar
        actionBar!!.title = "Third Activity"

        findViewById<Button>(R.id.secondActivityEndButton).setOnClickListener{
            Toast.makeText(this,"You've Reached The End", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.secondActivityButton).setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}