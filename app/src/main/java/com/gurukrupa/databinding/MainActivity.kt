package com.gurukrupa.databinding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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

        binding.buttonStart.setOnClickListener {
            gotoNextScreen()
        }
    }

    private fun displayGreeting() {
        binding.textGreeting.text = "Hello! " + binding.editTextName.text
        binding.editTextName.setText("")
    }

    private fun gotoNextScreen(){
        //Calling second activity 1 way
        startActivity(Intent(this@MainActivity, ShowHideProgressBarActivity::class.java))

        //Calling second activity 2 way
        //startActivity<ShowHideProgressBarActivity>(this)

        //Calling second activity 3 way
        //val intent = Intent(this, ShowHideProgressBarActivity::class.java)
        //intent.putExtra("key", value)
        //startActivity(intent)

    }

    private inline fun <reified T> startActivity(context: Context) {
        startActivity(Intent(context, T::class.java))
    }
}