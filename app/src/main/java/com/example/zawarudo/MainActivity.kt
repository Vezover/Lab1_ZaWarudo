package com.example.zawarudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun OnClickShowButton(view: View){
        val editText=findViewById<TextView>(R.id.editTextTextMultiLine)
        val showText=findViewById<TextView>(R.id.textView)
        showText.text=editText.text.toString()
    }
}
