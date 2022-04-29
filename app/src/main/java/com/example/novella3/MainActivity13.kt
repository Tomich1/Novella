package com.example.novella3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity13 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_13)
		val btn1 = findViewById<Button>(R.id.bt1)
		btn1.setOnClickListener {
			val intent = Intent(this, MainActivity14::class.java)
			startActivity(intent)
		}
	}
}