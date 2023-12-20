package com.gurukrupa.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gurukrupa.databinding.databinding.ActivityDisplayDataObjectBinding
import com.gurukrupa.databinding.model.Student

class DisplayDataObjectActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayDataObjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_display_data_object)

        binding.student = getStudent()

    }

    private fun getStudent():Student{
        return Student(1, "Ketan", "ketan@gmail.com")
    }
}