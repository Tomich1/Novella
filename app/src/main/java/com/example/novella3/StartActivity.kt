package com.example.novella3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_1)
	val startGame = findViewById<Button>(R.id.bt1)
		startGame.setOnClickListener {
			val intent = Intent(this, NameEntryActivity::class.java)
			startActivity(intent)
		}
	}
}
