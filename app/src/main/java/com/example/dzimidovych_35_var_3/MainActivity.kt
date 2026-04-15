package com.example.dzimidovych_35_var_3

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

         // Логіка для кнопки Yahoo
        val btnYahoo = findViewById<Button>(R.id.btnYahoo)
        btnYahoo.setOnClickListener {
            Toast.makeText(this, "Вхід через Yahoo...", Toast.LENGTH_SHORT).show()
        }

        // Логіка для кнопки Google
        val btnGoogle = findViewById<Button>(R.id.btnGoogle)
        btnGoogle.setOnClickListener {
            Toast.makeText(this, "Вхід через Google...", Toast.LENGTH_SHORT).show()
        }

        // Налаштування відступів системи (панель навігації та статус-бар)
        val mainView = findViewById<android.view.View>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}