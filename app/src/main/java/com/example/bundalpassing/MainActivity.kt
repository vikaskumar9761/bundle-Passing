package com.example.bundalpassing

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name=findViewById<EditText>(R.id.name)
        val father=findViewById<EditText>(R.id.father)
        val rollNo=findViewById<EditText>(R.id.rollNomber)
        val phone=findViewById<EditText>(R.id.phone)
        val done=findViewById<Button>(R.id.Donebtn)

        done.setOnClickListener {
            val name:String=name.text.toString()
            val father:String=father.text.toString()
            val rollNo:String=rollNo.text.toString()
            val phone:String=phone.text.toString()

            val intent=Intent(this,MainActivity2::class.java)

            intent.putExtra("name",name)
            intent.putExtra("father",father)
            intent.putExtra("rollNo",rollNo)
            intent.putExtra("phone",phone)

            startActivity(intent)

        }
    }
}