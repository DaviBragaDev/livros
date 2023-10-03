package com.example.livros.Model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livros.R
import com.example.livros.View.MainActivityViewModel
import com.example.livros.databinding.ActivityMainBinding

class MainActivityCadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel.class::java)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "banco_livros.sqlite"
        ).fallbackToDestructiveMigration()
            .allowMainThreadQueries().build()

        binding.buttonCadastrar.setOnClickListener{
            val intent = Intent(this, MainActivityCadastro::class.java)
            startActivity(intent)
        }
    }
