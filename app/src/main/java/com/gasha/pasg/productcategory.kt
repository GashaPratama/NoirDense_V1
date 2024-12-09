package com.gasha.pasg

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gasha.pasg.databinding.ActivityProductcategoryBinding

class productcategory : AppCompatActivity() {
    private lateinit var binding: ActivityProductcategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityProductcategoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productcategory)
        val pindah = findViewById<TextView>(R.id.product)
        pindah.setOnClickListener{
            val intent = Intent(this, product::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}