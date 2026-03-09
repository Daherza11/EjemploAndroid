package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.WidgetsBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var binding: WidgetsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = WidgetsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJtHpUVUSuUGvRVulSHtJofCd31QWOnQnPMw&s"

        Picasso.get().load(url).into(binding.imgPicasso)


//        binding.imgAvatar.setOnClickListener{
//            Toast.makeText(this, "Has pulsado la imagen", Toast.LENGTH_SHORT).show()
//
//        }

    }
}