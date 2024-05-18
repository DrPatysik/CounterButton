package com.example.counterbutton

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var counters: Counters

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button

    private lateinit var counterTextView1: TextView
    private lateinit var counterTextView2: TextView
    private lateinit var counterTextView3: TextView
    private lateinit var counterTextView4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counters = Counters()
       /* if(savedInstanceState == null){
            counters = Counters()
        }else
            counters = savedInstanceState.getParcelable("counters")!!*/
        initView()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("counters", counters)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle
    ) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null) {
            counters = savedInstanceState.getParcelable("counters")!!
        }
        setTextCounters()
    }

    private fun setTextCounters() {
        counterTextView1.text = counters.counter1.toString()
        counterTextView2.text = counters.counter2.toString()
        counterTextView3.text = counters.counter3.toString()
        counterTextView4.text = counters.counter4.toString()
    }


    private fun initView() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)


        counterTextView1 = findViewById(R.id.counter1)
        counterTextView2 = findViewById(R.id.counter2)
        counterTextView3 = findViewById(R.id.counter3)
        counterTextView4 = findViewById(R.id.counter4)

        //setTextCounters()

        button1.setOnClickListener {
            counters.incrementCounter1()
            counterTextView1.text = counters.counter1.toString()
        }
        button2.setOnClickListener {
            counters.incrementCounter2()
            counterTextView2.text = counters.counter2.toString()
        }
        button3.setOnClickListener {
            counters.incrementCounter3()
            counterTextView3.text = counters.counter3.toString()
        }
        button4.setOnClickListener {
            counters.incrementCounter4()
            counterTextView4.text = counters.counter4.toString()
        }
    }
}


