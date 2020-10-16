package com.androidquiz.app

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz3.*

class Quiz3Activity : AppCompatActivity() {
    private var userAnswerSelected2: String?=null
    var userAnswerSelected1: String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz3)
        setView()
    }

    private fun setView() {
            q1_1.setOnClickListener {
                userAnswerSelected1 = q1_1.text.toString()
                q1_1.setBackgroundColor(Color.GREEN)
                q1_2.setBackgroundColor(Color.WHITE)
                q1_3.setBackgroundColor(Color.WHITE)
                q1_4.setBackgroundColor(Color.WHITE)
            }
            q1_2.setOnClickListener {
                userAnswerSelected1 = q1_2.text.toString()
                q1_2.setBackgroundColor(Color.GREEN)
                q1_1.setBackgroundColor(Color.WHITE)
                q1_3.setBackgroundColor(Color.WHITE)
                q1_4.setBackgroundColor(Color.WHITE)
            }
            q1_3.setOnClickListener {
                userAnswerSelected1 = q1_3.text.toString()

                q1_3.setBackgroundColor(Color.GREEN)
                q1_1.setBackgroundColor(Color.WHITE)
                q1_2.setBackgroundColor(Color.WHITE)
                q1_4.setBackgroundColor(Color.WHITE)
            }
            q1_4.setOnClickListener {
                userAnswerSelected1 = q1_4.text.toString()

                q1_4.setBackgroundColor(Color.GREEN)
                q1_1.setBackgroundColor(Color.WHITE)
                q1_2.setBackgroundColor(Color.WHITE)
                q1_3.setBackgroundColor(Color.WHITE)
            }
            q2_1.setOnClickListener {
                userAnswerSelected2 = q2_1.text.toString()

                q2_1.setBackgroundColor(Color.GREEN)
                q2_3.setBackgroundColor(Color.WHITE)
                q2_2.setBackgroundColor(Color.WHITE)
                q2_4.setBackgroundColor(Color.WHITE)
            }
            q2_2.setOnClickListener {
                userAnswerSelected2 = q2_2.text.toString()

                q2_2.setBackgroundColor(Color.GREEN)
                q2_1.setBackgroundColor(Color.WHITE)
                q2_3.setBackgroundColor(Color.WHITE)
                q2_4.setBackgroundColor(Color.WHITE)
            }
            q2_3.setOnClickListener {
                userAnswerSelected2 = q2_3.text.toString()

                q2_3.setBackgroundColor(Color.GREEN)
                q2_1.setBackgroundColor(Color.WHITE)
                q2_2.setBackgroundColor(Color.WHITE)
                q2_4.setBackgroundColor(Color.WHITE)
            }
            q2_4.setOnClickListener {
                userAnswerSelected2 = q2_4.text.toString()

                q2_4.setBackgroundColor(Color.GREEN)
                q2_1.setBackgroundColor(Color.WHITE)
                q2_2.setBackgroundColor(Color.WHITE)
                q2_3.setBackgroundColor(Color.WHITE)
            }


    }
    fun nextScreen3(view: View) {

        if(!TextUtils.isEmpty(userAnswerSelected2) &&  !TextUtils.isEmpty(userAnswerSelected1)){

            if(userAnswerSelected1 == getString(R.string.json)){
                MainActivity.constant_value += 1
            }
            if(userAnswerSelected2 == getString(R.string.layout)){
                MainActivity.constant_value += 1
            }
            Toast.makeText(this, getString(R.string.Next), Toast.LENGTH_LONG).show()
            startActivity(Intent(this, Quiz4Activity::class.java))

        } else{
            Toast.makeText(this,getString(R.string.slect_both), Toast.LENGTH_SHORT).show();

        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MainActivity::class.java))    }

}






















































