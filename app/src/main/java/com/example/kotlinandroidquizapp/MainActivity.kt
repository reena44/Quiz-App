package com.example.kotlinandroidquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    companion object{
        var constant_value =0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startQuiz(view: View) {
        startActivity(Intent(this,Quiz1Activity::class.java))
    }
}