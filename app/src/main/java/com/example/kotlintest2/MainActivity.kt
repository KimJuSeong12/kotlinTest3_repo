package com.example.kotlintest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TokenWatcher
import android.util.Log
import android.widget.Toast
import com.example.kotlintest2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSet.text = getString(R.string.toast_Message)
        binding.btnSet.setOnClickListener {
            Toast.makeText(this@MainActivity, R.string.toast_Message, Toast.LENGTH_SHORT).show()
            Log.e("MainActivity", "R.string.toast_Message")
        }
    }
}