package com.example.navigationtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navigationtry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "First Activity"
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)


    }
}