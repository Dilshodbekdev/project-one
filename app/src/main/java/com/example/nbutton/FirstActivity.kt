package com.example.nbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val count : Int = intent.getIntExtra("kalit",0)
        for (i in 1 .. count) {
            var button : Button = Button(this)
            button.text = "button" + i
            linLay.addView(button)
        }
    }
}
