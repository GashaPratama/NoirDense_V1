package com.gasha.pasg

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gasha.pasg.databinding.ActivityProfilBinding

class profil : AppCompatActivity() {
    private lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfilBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        val pindah = findViewById<TextView>(R.id.about)
        val pindah2 = findViewById<TextView>(R.id.layanan)
        val pindah3 = findViewById<TextView>(R.id.contact)

        pindah.setOnClickListener{
            val intent = Intent(this, about::class.java)
            startActivity(intent)
        }
        pindah2.setOnClickListener{
            val intent = Intent(this, layanan::class.java)
            startActivity(intent)
        }
        pindah3.setOnClickListener{
            val intent = Intent(this, Hubungi::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}