package com.gasha.pasg

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gasha.pasg.databinding.ActivityHomeBinding

class home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val pindah = findViewById<ImageView>(R.id.profile)
        val pindah2 = findViewById<ImageView>(R.id.cart)
        val pindah3 = findViewById<TextView>(R.id.pria)
        pindah.setOnClickListener{
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }
        pindah2.setOnClickListener{
            val intent = Intent(this, cart1::class.java)
            startActivity(intent)
        }
        pindah3.setOnClickListener{
            val intent = Intent(this, productcategory::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}