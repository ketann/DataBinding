package com.gurukrupa.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.gurukrupa.databinding.databinding.ActivityShowHideProgressBarBinding

class ShowHideProgressBarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowHideProgressBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_show_hide_progress_bar)
        binding.buttonStart.setOnClickListener {
            hideShowProgressBar()
        }
    }

    private fun hideShowProgressBar() {
        //here we use apply function because of multiple time prevent binding words.
        binding.apply {
            if (progressBar.visibility == View.GONE)
            {
                progressBar.visibility = View.VISIBLE
                buttonStart.text = getString(R.string.stop)
            }else{
                progressBar.visibility = View.GONE
                buttonStart.text = getString(R.string.start)
            }
        }
    }
}