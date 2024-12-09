package com.gasha.pasg

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gasha.pasg.databinding.ActivityCart1Binding

class cart1 : AppCompatActivity() {
    private lateinit var binding: ActivityCart1Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityCart1Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val pindah = findViewById<TextView>(R.id.checkout)
        val pindah2 = findViewById<TextView>(R.id.continueShopping)
        pindah.setOnClickListener{
            val intent = Intent(this, cart2::class.java)
            startActivity(intent)
        }
        pindah2.setOnClickListener{
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}