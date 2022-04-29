package com.example.novella3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_6)
		val btn2 = findViewById<Button>(R.id.bt2)
		btn2.setOnClickListener {
			val intent = Intent(this, MainActivity7::class.java)
			startActivity(intent)
		}
		val btn3 = findViewById<Button>(R.id.bt3)
		btn3.setOnClickListener {
			val intent = Intent(this, MainActivity8::class.java)
			startActivity(intent)
		}
	}
}