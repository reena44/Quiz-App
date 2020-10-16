package com.androidquiz.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.androidquiz.app.MainActivity.Companion.constant_value
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val score = constant_value
        tv_score.text = getString(R.string.result)+constant_value.toString()
        when {
            score < 5 -> {
                img_good_job.visibility = View.GONE
                tv_try.text = getString(R.string.try_again)

            }
            score in 6..8 -> {
                img_good_job.visibility = View.VISIBLE
                tv_try.text = getString(R.string.great_work)
            }
            score in 9..10 -> {
                img_good_job.visibility = View.VISIBLE
                img_good_job.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.congrates))
                tv_try.text = getString(R.string.full_marks)
            }
        }
    }

    fun retakeQuiz(view: View) {
        startActivity(Intent(this,MainActivity::class.java))
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,MainActivity::class.java))    }
}