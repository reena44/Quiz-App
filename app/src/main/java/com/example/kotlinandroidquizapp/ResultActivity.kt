package com.example.kotlinandroidquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }

    fun retakeQuiz(view: View) {}
}