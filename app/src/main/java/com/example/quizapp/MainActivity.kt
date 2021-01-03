package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        tvSubmitButton.setOnClickListener {
            if(tvEditTextName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter name to continue:",Toast.LENGTH_SHORT).show()
            }
            else {

                val intent = Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,tvEditTextName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}