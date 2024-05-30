package com.example.counterbutton

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.counterbutton.databinding.ActivityMainBinding

//import Counters1
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var counters:Counters1

    /*private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button*/

    /*private lateinit var textViewCounter1: TextView
    private lateinit var textViewCounter2: TextView
    private lateinit var textViewCounter3: TextView
    private lateinit var textViewCounter4: TextView*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        counters = Counters1()
        itemsCounter()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("counters",counters)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        if(savedInstanceState!= null){
            counters = savedInstanceState.getParcelable("counters")!!
        }
        setTextCounters()
    }
    private fun setTextCounters(){
        binding.txtVCounter1.text = counters.counter1.toString()
        binding.txtVCounter2.text = counters.counter2.toString()
        binding.txtVCounter3.text = counters.counter3.toString()
        binding.txtVCounter4.text = counters.counter4.toString()
    }
    private fun itemsCounter(){
        /*button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)*/

        /*textViewCounter1 = findViewById(R.id.txtVCounter1)
        textViewCounter2 = findViewById(R.id.txtVCounter2)
        textViewCounter3 = findViewById(R.id.txtVCounter3)
        textViewCounter4 = findViewById(R.id.txtVCounter4)*/

        binding.button1.setOnClickListener {
            counters.incrementCounter1()
            binding.txtVCounter1.text = counters.counter1.toString()
        }

        binding.button2.setOnClickListener {
            counters.incrementCounter2()
            binding.txtVCounter2.text = counters.counter2.toString()
        }

        binding.button3.setOnClickListener {
            counters.incrementCounter3()
            binding.txtVCounter3.text = counters.counter3.toString()
        }

        binding.button4.setOnClickListener {
            counters.incrementCounter4()
            binding.txtVCounter4.text = counters.counter4.toString()
        }
    }
}

