package com.androidquiz.app

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidquiz.app.MainActivity.Companion.constant_value
import kotlinx.android.synthetic.main.activity_quiz2.*


class Quiz2Activity : AppCompatActivity() {
    private var userAnswerSelected2: String?=null
    var userAnswerSelected1: String?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)
        setView()

    }
    private fun setView() {
        checkbox1_1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected1 = checkbox1_1.getText().toString()
                checkbox1_2.isChecked = false
                checkbox1_3.setChecked(false)
                checkbox1_4.setChecked(false)
            }
        })
        checkbox1_2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected1 = checkbox1_2.getText().toString()
                checkbox1_1.isChecked = false
                checkbox1_3.setChecked(false)
                checkbox1_4.setChecked(false)
            }
        })
        checkbox1_3.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected1 = checkbox1_3.getText().toString()
                checkbox1_1.isChecked = false
                checkbox1_2.setChecked(false)
                checkbox1_4.setChecked(false)
            }
        })
        checkbox1_4.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected1 = checkbox1_4.getText().toString()
                checkbox1_1.isChecked = false
                checkbox1_2.setChecked(false)
                checkbox1_3.setChecked(false)
            }
        })
        checkbox2_1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected2 = checkbox2_1.getText().toString()
                checkbox2_2.setChecked(false)
                checkbox2_3.setChecked(false)
                checkbox2_4.setChecked(false)
            }
        })
        checkbox2_2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected2 = checkbox2_2.getText().toString()
                checkbox2_1.setChecked(false)
                checkbox2_3.setChecked(false)
                checkbox2_4.setChecked(false)
            }
        })
        checkbox2_3.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected2 = checkbox2_3.getText().toString()
                checkbox2_1.setChecked(false)
                checkbox2_2.setChecked(false)
                checkbox2_4.setChecked(false)
            }
        })
        checkbox2_4.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                userAnswerSelected2 = checkbox2_4.getText().toString()
                checkbox2_1.setChecked(false)
                checkbox2_2.setChecked(false)
                checkbox2_3.setChecked(false)
            }
        })
    }
    fun nextScreen2(view: View) {

        if(!TextUtils.isEmpty(userAnswerSelected2) &&  !TextUtils.isEmpty(userAnswerSelected1)){

            if(userAnswerSelected1 == getString(R.string.jni)){
                constant_value += 1
            }
            if(userAnswerSelected2 == getString(R.string.apk)){
              constant_value += 1
            }
            Toast.makeText(this, getString(R.string.Next), Toast.LENGTH_LONG).show()
            startActivity(Intent(this, Quiz3Activity::class.java))

        } else{
            Toast.makeText(this,getString(R.string.slect_both),Toast.LENGTH_SHORT).show();

        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MainActivity::class.java))    }
}