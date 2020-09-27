package com.example.kotlinandroidquizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_quiz2.*


class Quiz2Activity : AppCompatActivity() {
    lateinit var value1:String
    lateinit var value2:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)
    }
    fun nextScreen2(view: View) {


        checkbox1_1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value1= " "
                checkbox1_2.isChecked = false
                checkbox1_3.isChecked = false
                checkbox1_4.isChecked = false
                value1 = checkbox1_1.text.toString()

            }
        })
        checkbox1_2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value1= " "
                checkbox1_1.isChecked = false
                checkbox1_3.isChecked = false
                checkbox1_4.isChecked = false
                value1 = checkbox1_2.text.toString()


            }
        })
        checkbox1_3.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value1= " "

                checkbox1_1.isChecked = false
                checkbox1_2.isChecked = false
                checkbox1_4.isChecked = false
                value1 = checkbox1_3.text.toString()

            }
        })
        checkbox1_4.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value1= " "
                checkbox1_1.isChecked = false
                checkbox1_3.isChecked = false
                checkbox1_2.isChecked = false
                value1 = checkbox1_4.text.toString()

            }
        })
        checkbox2_1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value2= " "
                checkbox2_1.isChecked = false
                checkbox2_2.isChecked = false
                checkbox2_3.isChecked = false
                value2 = checkbox2_1.text.toString()

            }
        })
        checkbox2_2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value2= " "
                checkbox2_1.isChecked = false
                checkbox2_2.isChecked = false
                checkbox2_3.isChecked = false
                value2 = checkbox2_2.text.toString()

            }
        })
        checkbox2_3.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value2= " "
                checkbox2_1.isChecked = false
                checkbox2_2.isChecked = false
                checkbox2_3.isChecked = false
                value2 = checkbox2_3.text.toString()

            }
        })
        checkbox2_4.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                value2= " "
                checkbox2_1.isChecked = false
                checkbox2_2.isChecked = false
                checkbox2_3.isChecked = false
                value2 = checkbox2_4.text.toString()

            }
        })

        if (value1.isNullOrEmpty() && value2.isNullOrEmpty()){
            Toast.makeText(this,"Please select both answers first", Toast.LENGTH_LONG).show()

        }
        else {
            if (value1 == getString(R.string.jni))
                MainActivity.constant_value += 1
            if (value2 == getString(R.string.jni))
                MainActivity.constant_value += 1
            startActivity(Intent(this,Quiz3Activity::class.java))
        }
    }

}