package com.example.novella3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_3)
		
		 val tvView = findViewById<TextView>(R.id.sceneHeader)
		val nameUser = intent.getStringExtra("nameUser").toString()
		
		("Отлично, $nameUser! Чем займемся?").also { tvView.text = it }
		
		
		val btn1 = findViewById<Button>(R.id.bt1)
		btn1.setOnClickListener {
			val intent = Intent(this, MainActivity4::class.java)
			startActivity(intent)
		}
		val btn2 = findViewById<Button>(R.id.bt2)
		btn2.setOnClickListener {
			val intent = Intent(this, MainActivity5::class.java)
			startActivity(intent)
		}
		val btn3 = findViewById<Button>(R.id.bt3)
		btn3.setOnClickListener {
			val intent = Intent(this, MainActivity6::class.java)
			startActivity(intent)
		}
	}
}
