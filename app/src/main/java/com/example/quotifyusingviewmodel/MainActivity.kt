package com.example.quotifyusingviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var txtCounter : TextView //counterText
    lateinit var floatingActionButton : FloatingActionButton //counterText
    lateinit var mainViewModel : MainViewModel //ViewModel hai

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtCounter = findViewById(R.id.txtCounter)
        floatingActionButton = findViewById(R.id.floatingActionButton)

        //this is th owner of this mainViewModel
        // here we are passing viewModelFactory instance

        mainViewModel = ViewModelProvider(
            this,MainViewModelFactory(10)).get(MainViewModel::class.java)
        setText()
        floatingActionButton.setOnClickListener{
            mainViewModel.increment()
        }
    }
    private fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }

}