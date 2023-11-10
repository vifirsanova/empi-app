package com.example.empi

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    lateinit var toplayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        toplayout=findViewById(R.id.toplayout)
        var textview = TextView(this)
        textview.text=resources.getText(R.string.greeting)
        toplayout.addView(textview)
    }
}