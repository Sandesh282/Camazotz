package com.example.questionbank

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import org.w3c.dom.Text

class zzzProfile_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_page)

        val sharedPref = getSharedPreferences("userdata",MODE_PRIVATE)
        val name = sharedPref.getString("name",null) ?: "Not Found"
        val email = sharedPref.getString("email",null) ?: "Not Found"
        val phone = sharedPref.getString("phone",null) ?: "Not Found"
        val age = sharedPref.getString("age",null) ?: "Not Found"
        val state = sharedPref.getString("state",null) ?: "Not Found"

        val nText = findViewById<TextView>(R.id.etName)
        val eText = findViewById<TextView>(R.id.etEmail)
        val pText = findViewById<TextView>(R.id.phoneText)
        val aText = findViewById<TextView>(R.id.ageText)
        val sText = findViewById<TextView>(R.id.stateText)
        val backBtn = findViewById<MaterialButton>(R.id.backBtn)

        nText.text = state
        eText.text = phone
        pText.text = age
        aText.text = name
        sText.text = email

        backBtn.setOnClickListener {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}