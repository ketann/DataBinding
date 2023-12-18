package com.gurukrupa.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.gurukrupa.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonSubmit.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.textGreeting.text = "Hello! " + binding.editTextName.text
        binding.editTextName.setText("")
    }
}