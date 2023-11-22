package com.example.empi

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity

const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {

    lateinit var toplayout : LinearLayout
    // onCreate() is a callback method every activity must implement once,
    // after the Activity is initialized (created in memory);
    // e.g., onCreate() initializes layout;
    override fun onCreate(savedInstanceState: Bundle?) {
        // d is for debug; i is for info; e is for error; v is for vebose
        Log.d(TAG, "onCreate Called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        toplayout=findViewById(R.id.toplayout)
        toplayout.setBackgroundColor(Color.parseColor("#ffffff"))
        var textview = TextView(this)
        textview.text=resources.getText(R.string.login)
        //textview.setTextColor(Color.parseColor("#C1D8F0"))
        //toplayout.addView(textview)
    }
    override fun onStart() {
        // now we can resume the app after clicking Home
        super.onStart()
        Log.d(TAG, "onStart Called")
    }
}