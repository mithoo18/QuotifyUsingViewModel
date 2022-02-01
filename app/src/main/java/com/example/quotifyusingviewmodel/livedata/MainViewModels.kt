package com.example.quotifyusingviewmodel.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModels : ViewModel() {
    //LIVE DATA READ ONLY CAN'T CHANGE
    //Mutable LIVE DATA CAN BE CHANGE
    val factsLiveData =
        MutableLiveData<String>("This is a fact")

    fun updateLiveData(){
        factsLiveData.value = "Another fact"
    }

}