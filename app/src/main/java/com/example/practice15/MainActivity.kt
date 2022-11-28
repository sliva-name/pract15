package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonGo_Click(view: View) {
        val breedText: TextView = findViewById(R.id.editTextTextBreed)
        val yearOfBirthText: TextView = findViewById(R.id.editTextTextYearOfBirth)
        val monthOfBirthText: TextView = findViewById(R.id.editTextTextMonthOfBirth)
        val breed = breedText.text.toString()
        val year = yearOfBirthText.text.toString()
        val month = monthOfBirthText.text.toString()
        val user: Animal = Animal(breed, year, month)
        val intent: Intent = Intent(
            this@MainActivity,
            MainActivity2::class.java
        )
        intent.putExtra(user.javaClass.simpleName, user)
        when (view.id) {
            R.id.buttonGo -> startActivity(intent)
        }
    }
}