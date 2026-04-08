package com.cplover.team_krantikari_camazotz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val btn3 = findViewById<Button>(R.id.button3);
        val username = findViewById<TextInputEditText>(R.id.username)
        val password = findViewById<TextInputEditText>(R.id.password)
        btn3.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            true
        }
        btn.setOnClickListener() {

            val txt = "Welcome User : ${username.text.toString()}"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()

            val intent = Intent(this , MainActivity2::class.java)

            intent.putExtra("Username",username.text.toString())
            intent.putExtra("Password", password.text.toString())
            startActivity(intent)
            true
        }
        val txt = "Welcome"
        val dur = Toast.LENGTH_LONG

        val toast = Toast.makeText(this , txt , dur)
        toast.show()

    }
}