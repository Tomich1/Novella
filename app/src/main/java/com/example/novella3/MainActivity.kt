package com.example.novella3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import java.security.acl.Group

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_1)
		
		val startGame = findViewById<Button>(R.id.bt1)
		
		startGame.setOnClickListener {
			val intent = Intent(this, MainActivity2::class.java)
			startActivity(intent)
			
		}
	}
}