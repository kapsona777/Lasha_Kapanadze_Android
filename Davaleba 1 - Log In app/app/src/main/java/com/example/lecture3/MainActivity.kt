package com.example.lecture3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        loginButton.setOnClickListener{
            if(mailEditText.text.toString().isNotEmpty() && passEditText.text.toString().isNotEmpty() ){
                Toast.makeText(this,"Log In is Success!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Please fill all fields!", Toast.LENGTH_LONG).show()
            }
        }
    }

}
