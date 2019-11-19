package com.example.anagramgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_Go=findViewById<Button>(R.id.button_Go)

        button_Go.setOnClickListener {
            startActivity (
                Intent(this, NewActivity::class.java))



        }
    }
}
