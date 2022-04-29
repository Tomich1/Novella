package com.example.novella3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_2)
		val editTX = findViewById<EditText>(R.id. editTextTextPersonName)
		val btn3 = findViewById<Button>(R.id.bt3)
		btn3.setOnClickListener {
			val intent2 = Intent(this, MainActivity3::class.java)
			intent2.putExtra("nameUser", editTX.text.toString())
			startActivity(intent2)
		}
	}
}
