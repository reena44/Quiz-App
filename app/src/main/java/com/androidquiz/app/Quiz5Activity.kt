package com.androidquiz.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz5.*

class Quiz5Activity : AppCompatActivity() {
    private var userAnswerSelected1: String? = null
    private var userAnswerSelected2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz5)
        setView()
    }
    private fun setView() {

        q9_1.setOnClickListener {
            userAnswerSelected1 = q9_1.text.toString()
            q9_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_check, 0);
            q9_2.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q9_3.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q9_4.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
        }
        q9_2.setOnClickListener {
            userAnswerSelected1 = q9_2.text.toString()
            q9_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            q9_2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_check, 0);
            q9_3.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q9_4.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
        }
        q9_3.setOnClickListener {
            userAnswerSelected1 = q9_3.text.toString()
            q9_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            q9_2.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q9_3.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_check, 0);
            q9_4.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
        }
        q9_4.setOnClickListener {
            userAnswerSelected1 = q9_4.text.toString()
            q9_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            q9_2.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q9_3.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q9_4.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_check, 0);
        }
        q10_1.setOnClickListener {
            userAnswerSelected2 = q10_1.text.toString()
            q10_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_check, 0);
            q10_2.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q10_3.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q10_4.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
        }
        q10_2.setOnClickListener {
            userAnswerSelected2 = q10_2.text.toString()
            q10_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            q10_2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_check, 0);
            q10_3.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q10_4.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
        }
        q10_3.setOnClickListener {
            userAnswerSelected2 = q10_3.text.toString()
            q10_1.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q10_2.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q10_3.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_check, 0);
            q10_4.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
        }
        q10_4.setOnClickListener {
            userAnswerSelected2= q10_4.text.toString()
            q10_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            q10_2.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q10_3.setCompoundDrawablesWithIntrinsicBounds(0,0, 0, 0);
            q10_4.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_check, 0);
        }

    }




    fun nextScreen5(view: View) =
        if(!TextUtils.isEmpty(userAnswerSelected2) &&  !TextUtils.isEmpty(userAnswerSelected1)){

            if(userAnswerSelected1 == getString(R.string.permissions)){
                MainActivity.constant_value += 1
            }
            if(userAnswerSelected2 == getString(R.string.avd)){
                MainActivity.constant_value += 1
            }
            Toast.makeText(this, getString(R.string.end_quiz), Toast.LENGTH_LONG).show()
            startActivity(Intent(this,ResultActivity::class.java))

        } else{
            Toast.makeText(this,getString(R.string.slect_both), Toast.LENGTH_SHORT).show();

        }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MainActivity::class.java))    }
}