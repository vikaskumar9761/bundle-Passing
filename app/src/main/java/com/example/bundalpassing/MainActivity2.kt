package com.example.bundalpassing

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val name=findViewById<TextView>(R.id.firstName)
        val fatherN=findViewById<TextView>(R.id.fatherName)
        val roll=findViewById<TextView>(R.id.rallNamber)
        val phoneN=findViewById<TextView>(R.id.phoneNamber)

        val intent = intent

        val names=intent.getStringExtra("name")
        val father=intent.getStringExtra("father")
        val rollN=intent.getStringExtra("rollNo")
        val phone=intent.getStringExtra("phone")

        name.text="name :$names"
        fatherN.text="Father's : $father"
        roll.text="Roll No : $rollN"
        phoneN.text="Phone No : $phone"
    }
}