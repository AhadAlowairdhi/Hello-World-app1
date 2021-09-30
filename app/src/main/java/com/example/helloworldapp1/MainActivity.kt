package com.example.helloworldapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var msg = "Hello World! I'm new developer"
        var name = "Ahad"
        Log.d("MainActivity", msg )
        Log.d("MainActivity", "Hello World! I'm $name")
    }
}