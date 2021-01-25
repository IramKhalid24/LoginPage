package com.iram2world.loginpage

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btnLogRegister)
        button.setOnClickListener {
            onBackPressed()
        }
    }
        override fun onBackPressed() {
            super.onBackPressed()
            overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
        }

}