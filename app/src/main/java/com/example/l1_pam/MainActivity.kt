package com.exwample.l1_pam



import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.YOU.l1_pam.R
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = findViewById<View>(R.id.input) as TextView
        val btn = findViewById<MaterialButton>(R.id.strtbtn) as MaterialButton
        btn.setOnClickListener{
            val str = input.text.toString().split(" ")
            var num:Int = 0
            for (i in str) {
                if(i.contains("a")||i.contains("A")) {
                    num += 1
                }
            }

            Toast.makeText(applicationContext,"Char A = $num", Toast.LENGTH_SHORT).show()

        }






    }
    }






