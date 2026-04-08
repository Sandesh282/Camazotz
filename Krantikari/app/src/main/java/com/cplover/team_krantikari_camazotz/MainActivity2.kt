package com.cplover.team_krantikari_camazotz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.button4)
        val btn2 = findViewById<Button>(R.id.button0)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button2)
        val btn5 = findViewById<Button>(R.id.button6)
        val btn6 = findViewById<Button>(R.id.button7)
        val btn7 = findViewById<Button>(R.id.button)

        val name = intent.getStringExtra("Username")

        btn2.setOnClickListener {
            val toast = Toast.makeText(this, "Password: ${name}", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {
            val toast = Toast.makeText(this, "Welcome To Foss Wing", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val toast = Toast.makeText(this, "Welcome To CP Wing", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val toast = Toast.makeText(this, "Welcome To APP Wing", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        btn5.setOnClickListener {
            val toast = Toast.makeText(this, "Welcome To Infosec Wing", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btn6.setOnClickListener {
            val toast = Toast.makeText(this, "Welcome To Web Wing", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btn7.setOnClickListener {
            val toast = Toast.makeText(this, "Welcome", Toast.LENGTH_LONG)
            toast.show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}