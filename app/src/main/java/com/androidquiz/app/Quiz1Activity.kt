package com.androidquiz.app

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidquiz.app.MainActivity.Companion.constant_value
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
        val selectedId1: Int = rd_group1.checkedRadioButtonId
        val selectedId2: Int = rd_group2.checkedRadioButtonId

        val radioButton1 = findViewById<RadioButton>(selectedId1)
        val radioButton2 = findViewById<RadioButton>(selectedId2)


        if (checkValidation()) {
            if (radioButton1.text.toString() == getString(R.string.services_life_cycle) ) {
                 constant_value += 1
             }
             if (radioButton2.text.toString() == getString(R.string.avialable_broadcast_receiver) ) {
                 constant_value += 1
             }
            Toast.makeText(this, getString(R.string.Next), Toast.LENGTH_LONG).show()

            startActivity(Intent(this,Quiz2Activity::class.java))
         }
    }

    private fun checkValidation():Boolean {
        when {
            rd_group1.checkedRadioButtonId == -1 -> {
                Toast.makeText(this, getString(R.string.slect_both), Toast.LENGTH_LONG).show()
            }
            rd_group2.checkedRadioButtonId == -1 -> {
                Toast.makeText(this, getString(R.string.slect_both), Toast.LENGTH_LONG).show()
            }
            else -> return true
        }
        return false

    }

    override fun onBackPressed() {
        super.onBackPressed()
startActivity(Intent(this,MainActivity::class.java))    }


}