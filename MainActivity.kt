package com.example.quiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        btn_start.setOnClickListener {
            val intent=Intent(this,QuiazQuestion::class.java)
            startActivity(intent)
            finish()
        }
    }

}
