package com.example.o1083031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun AddOne(v: View) {
        counter++
        txv.text = counter.toString()
    }

    fun AddTwo(v: View) {
        counter += 2
        txv.text = counter.toString()

    }

        fun Add(v: View) {
            counter =0
            txv.text = counter.toString()
    }
}