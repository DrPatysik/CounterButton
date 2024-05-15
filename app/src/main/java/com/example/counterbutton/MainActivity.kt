package com.example.counterbutton

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button1:Button
    private lateinit var button2:Button
    private lateinit var button3:Button
    private lateinit var button4:Button

    private lateinit var counterTextView1:TextView
    private lateinit var counterTextView2:TextView
    private lateinit var counterTextView3:TextView
    private lateinit var counterTextView4:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)


        counterTextView1 = findViewById(R.id.counter1)
        counterTextView2 = findViewById(R.id.counter2)
        counterTextView3 = findViewById(R.id.counter3)
        counterTextView4 = findViewById(R.id.counter4)


        button1.setOnClickListener {
            onTap(counterTextView1)
        }
        button2.setOnClickListener {
            onTap(counterTextView2)
        }
        button3.setOnClickListener {
            onTap(counterTextView3)
        }
        button4.setOnClickListener {
            onTap(counterTextView4)
        }

    }

    private fun onTap(text:TextView){

        val pushString = text.text.toString()
        var pushInt = pushString.toInt()
        pushInt++
        text.setText(pushInt.toString())

    }
}


