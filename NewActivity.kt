package com.example.anagramgame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.random.Random
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_new.*
import android.widget.Toast
//import Anagram
import Ana.randomWord

class NewActivity : AppCompatActivity() {

    private val wordTv: TextView? = null
    private val editText: EditText? = null
    private val validate: Button? = null
    private val newGame: Button? = null
    private val wordToFind: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)


    }

    fun onClick(view: View) {
        if (view === validate) {
            validate()
        } else if (view === new_game) {
            new_game
        }
    }
    private fun validate() {
        val w = editText.getText().toString()

        var any = if (wordToFind.equals(w)) {
            Toast.makeText(
                this, "Congratulations ! You found the word $wordToFind",
                Toast.LENGTH_SHORT
            ).show()
            new_game
        } else {
            Toast.makeText(this, "Retry !", Toast.LENGTH_SHORT).show()
        }
    }

    private fun new_game() {
       val wordToFind = Anagram.randomWord()
      val wordShuffled = Anagram.shuffleWord(wordToFind)
       wordTv.setText(wordShuffled)
     editText.setText("")
   }

}
