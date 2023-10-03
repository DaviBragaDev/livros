package com.example.livros.Model


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livros.View.MainActivityViewModel
import com.example.livros.R
import com.example.livros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = DataBindingUtil.setContentView(R.layout.activity_main)
            viewModel = ViewModelProvider(this):get(MainActivityViewModel::class.java)

            binding.buttonCadastrar.setOnClickListener {
                var intent = Intent(this, MainActivityCadastro::class.java)
                startActivity(intent)
            }





        }


    }
