 package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

 class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textView: TextView = findViewById(R.id.textViewShow)
        var animal: Animal = Animal()
        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            animal =
                arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal
            textView.text =
                "Год рождения: ${animal.getYear()}\n" +
                        "Месяц рождения: ${animal.getMonth()}" +
                        "\nПорода: ${animal.getBreed()}"
        }
    }
}