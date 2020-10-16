package com.androidquiz.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private var arr: ArrayList<Int> = arrayListOf()

    companion object{
        var constant_value =0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun startQuiz(view: View) {
        constant_value =0
        Toast.makeText(this, "start quiz", Toast.LENGTH_LONG).show()
        startActivity(Intent(this, Quiz1Activity::class.java))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        closeApp()
    }

    private fun closeApp() {

        val exitIntent = Intent(Intent.ACTION_MAIN)
        exitIntent.addCategory(Intent.CATEGORY_HOME)
        exitIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(exitIntent)
    }
}
