package ru.nutscoon.psbcretid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.nutscoon.psb.credit.CreditActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)

        btn1.setOnClickListener {
            val myIntent = Intent(this, CreditActivity::class.java)
            this.startActivity(myIntent)
        }

        btn2.setOnClickListener {
            val myIntent = Intent(this, CreditActivity::class.java)
            myIntent.putExtra("show_offer", 2362)
            this.startActivity(myIntent)
        }
    }
}