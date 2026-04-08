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
        val btn2 = findViewById<Button>(R.id.button)
        val btn = findViewById<Button>(R.id.button3);
        val username = findViewById<TextInputEditText>(R.id.pass)
        btn.setOnLongClickListener {
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
            true
        }
        btn2.setOnLongClickListener() {
            var u = username.text.toString()
            val txt = "Welcome User : Password=${u}"
            val dur = Toast.LENGTH_LONG
            intent.putExtra("Username",u)

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity3::class.java)
            var user = username.text.toString()
            intent.putExtra("Username",user)
            startActivity(intent)
            true
        }
        val txt = "Welcome"
        val dur = Toast.LENGTH_LONG

        val toast = Toast.makeText(this , txt , dur)
        toast.show()

    }
}