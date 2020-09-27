package com.example.kotlinandroidquizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinandroidquizapp.MainActivity.Companion.constant_value
import kotlinx.android.synthetic.main.activity_quiz1.*


class Quiz1Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz1)
btn_next1.setOnClickListener {
    nextScreen1()
        }

    }

    private fun nextScreen1() {
        val radioButton1 = findViewById<RadioButton>(rd_group1.checkedRadioButtonId)
        val radioButton2 = findViewById<RadioButton>(rd_group2.checkedRadioButtonId)


        if (checkValidation()) {
            val ans1 = radioButton1.text.toString()
            val ans2 = radioButton2.text.toString()
            if (ans1 == getString(R.string.services_life_cycle) ) {
                constant_value += 1
            }
            if (ans2 == getString(R.string.avialable_broadcast_receiver) ) {
                constant_value += 1
            }
            Toast.makeText(this, constant_value,Toast.LENGTH_LONG).show()

            startActivity(Intent(this,Quiz2Activity::class.java))
        }
    }

    private fun checkValidation():Boolean {
        if (rd_group1.checkedRadioButtonId == -1 && rd_group2.checkedRadioButtonId == -1)
        {
            Toast.makeText(this,"Please select both answers first",Toast.LENGTH_LONG).show()
        }
        else return true
        return false

    }

}