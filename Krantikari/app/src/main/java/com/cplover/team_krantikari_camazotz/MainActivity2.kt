package com.cplover.team_krantikari_camazotz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        btn2.setOnLongClickListener {
            val txt = "UserName: ${name}"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            true
        }
        btn.setOnLongClickListener() {
            val txt = "Welcome To Foss Wing"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
            true
        }
        btn4.setOnLongClickListener() {
            val txt = "Welcome To CP Wing"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
            true
        }
        btn3.setOnLongClickListener() {
            val txt = "Welcome To APP Wing"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity3::class.java)
            startActivity(intent)
            true
        }
        btn5.setOnLongClickListener() {
            val txt = "Welcome To Infosec Wing"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
            true
        }
        btn6.setOnLongClickListener() {
            val txt = "Welcome To Web Wing"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
            true
        }
        btn7.setOnLongClickListener() {
            val txt = "Welcome"
            val dur = Toast.LENGTH_LONG

            val toast = Toast.makeText(this , txt , dur)
            toast.show()
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
            true
        }


    }
}