package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val oper = binding.operator.text.toString()


        binding.equalbtn.setOnClickListener {
            val op1 = binding.firstnum.text.toString()
            val op2 = binding.secondnum.text.toString()
            val oper = binding.operator.text.toString()
        Log.d("Hello",op1)

        Log.d("Hello","Hello")
        if(op1.isNotEmpty() && op2.isNotEmpty() && oper.isNotEmpty()) {
            val num1 = op1.toInt()
            val num2 = op2.toInt()
            if(num1 == null || num2 == null){
                Toast.makeText(this, "Invalid number input", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val results = when (oper) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> if (num2 != 0){ num1 / num2}
                else {
                    Toast.makeText(this, "Invalid number input", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                else -> {
                    Toast.makeText(this, "Invalid operator", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            }
            binding.resulttv.text = results.toString()
        } else {
            Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
        }

        }

        binding.startlearningbutton.setOnClickListener {
            val intent = Intent(this, LearningPage::class.java)
            startActivity(intent)
            finish()
        }
//        binding.btn.setOnClickListener {
//            val n1=binding.number1.text.toString()
//            val num1=n1.toDoubleOrNull()
//            val n2=binding.number2.text.toString()
//            val num2=n2.toDoubleOrNull()
//            val ope=binding.operator.text.toString()
//            if(num1!=null && num2!=null)
//            {
//
//                val results= when(ope){
//                    "+"->num1+num2
//                    "-"->num1-num2
//                    "*"->num1*num2
//                    "/"-> if(num2!=0.0) num1/num2 else "invalid"
//                    else -> "invalid operator"
//                }
//                binding.result.text=results.toString()
//
//
//
//            }


    }
}