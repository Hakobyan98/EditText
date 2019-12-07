package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.viewButton)
        button.setOnClickListener{ edit() }

        val editText:EditText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)

    }

    private fun edit(){
        textView.text = editText.text
    }
}
