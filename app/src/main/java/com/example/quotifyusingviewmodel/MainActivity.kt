package com.example.quotifyusingviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.quotifyusingviewmodel.livedata.MainViewModels
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
lateinit var mainViewModel : MainViewModels

private val factsTextView : TextView
//This is a getter
get() = findViewById(R.id.txtCounter)

private val btnUpdate : FloatingActionButton
    //This is a getter
    get() = findViewById(R.id.floatingActionButton)


//TODO 1 BRANCH
    /*
    lateinit var txtCounter : TextView //counterText
    lateinit var floatingActionButton : FloatingActionButton //counterText
    lateinit var mainViewModel : MainViewModel //ViewModel hai
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 1 BRANCH
        /*txtCounter = findViewById(R.id.txtCounter)
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
    }*/

    mainViewModel = ViewModelProvider(this).get(MainViewModels::class.java)

    //Take live datafrm viewModel
    mainViewModel.factsLiveData.observe(this, Observer{
     factsTextView.text = it
    })

    //TODO When we click this button then it will go viewmodel update our data
    // their and then with the help of observer it update
    btnUpdate.setOnClickListener {
        mainViewModel.updateLiveData()
    }

    }
}