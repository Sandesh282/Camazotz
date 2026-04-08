package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ajbjhbdlbduibdiubi.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.hddguruyghivh.setOnClickListener {
            val op1 = binding.gyyiuwhuihiu12.text.toString()
            val op2 = binding.gyyiuwhuihiv12.text.toString()
            val oper = binding.y2y3273ygq87rfbq.text.toString()

            if (op1.isNotEmpty() && op2.isNotEmpty()) {
                val opp1 = op1.toInt()
                val opp2 = op2.toInt()

                val results = when (oper) {
                    "+" -> opp1 + opp2
                    "-" -> opp1 - opp2
                    "*" -> opp1 * opp2
                    "/" -> if (opp2 != 0) opp1 / opp2 else "invalid"
                    else -> "invalid operator"
                }

                val toast = Toast.makeText(this, results.toString(), Toast.LENGTH_SHORT)
                toast.show()
            }
        }

        binding.y93809109fj0n0.setOnClickListener {
            val intent = Intent(this, LearningPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}