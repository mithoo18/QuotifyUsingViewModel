package com.example.quotifyusingviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//To pass data add in constructor

class MainViewModelFactory(val counter : Int) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        // create object of main view model
        // here T is generic type
        return MainViewModel(counter) as T

    }
}