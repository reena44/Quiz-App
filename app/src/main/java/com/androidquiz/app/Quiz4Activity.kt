package com.androidquiz.app

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_quiz4.*

class Quiz4Activity : AppCompatActivity() {
    private var userAnswerSelected1: String?= null
    private var userAnswerSelected2: String?= null


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz4)

        setView()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setView() {
        q7_1.setOnClickListener {
            userAnswerSelected1 = q7_1.text.toString()
            q7_1.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))
            q7_2.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_3.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_4.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
        }
        q7_2.setOnClickListener {
            userAnswerSelected1 = q7_2.text.toString()
            q7_1.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_2.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))
            q7_3.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_4.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
        }
        q7_3.setOnClickListener {
            userAnswerSelected1 = q7_3.text.toString()
            q7_1.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_2.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_3.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))
            q7_4.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
        }
        q7_4.setOnClickListener {
            userAnswerSelected1 = q7_4.text.toString()
            q7_1.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_2.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_3.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q7_4.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))

        }
        q8_1.setOnClickListener {
            userAnswerSelected2 = q8_1.text.toString()
            q8_1.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))
            q8_2.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_3.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_4.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
        }
        q8_2.setOnClickListener {
            userAnswerSelected2 = q8_2.text.toString()
            q8_1.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_2.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))
            q8_3.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_4.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))


        }
        q8_3.setOnClickListener {
            userAnswerSelected2 = q8_3.text.toString()
            q8_2.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_4.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_3.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))
            q8_1.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))

        }
        q8_4.setOnClickListener {
            userAnswerSelected2 = q8_4.text.toString()
            q8_1.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_2.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_3.setBackgroundDrawable(getDrawable(R.drawable.bg_questions))
            q8_4.setBackgroundDrawable(getDrawable(R.drawable.bg_selected_answers))

        }
    }

    fun nextScreen4(view: View) {
        if(!TextUtils.isEmpty(userAnswerSelected2) &&  !TextUtils.isEmpty(userAnswerSelected1)){

            if(userAnswerSelected1 == getString(R.string.kt)){
                MainActivity.constant_value += 1
            }
            if(userAnswerSelected2 == getString(R.string.activity_main)){
                MainActivity.constant_value += 1
            }
            Toast.makeText(this, getString(R.string.Next), Toast.LENGTH_LONG).show()
            startActivity(Intent(this,Quiz5Activity::class.java))

        } else{
            Toast.makeText(this,getString(R.string.slect_both), Toast.LENGTH_SHORT).show();

        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MainActivity::class.java))    }

}