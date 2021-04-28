package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resault.*

class ResaultActivity : AppCompatActivity() {

    private var quizadapter: quizAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resault)

        rv.adapter = quizAdapter(Constants.getQuestionList())
        val resault = intent.getStringExtra("res")
        tv_res.text = "your score is: " + resault?.toString()+"/10"

    }


}
