package com.example.front_endassignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.front_endassignment2.databinding.ActivityMainBinding
import com.example.front_endassignment2.fragments.BottomSheetFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        val bottomSheet = BottomSheetFragment()

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.navigation.setOnClickListener{
//            when(R.id.profile){
//                bottomSheet.show(supportFragmentManager, "BottomSheetDialog")
//            }
//        }
    }
}