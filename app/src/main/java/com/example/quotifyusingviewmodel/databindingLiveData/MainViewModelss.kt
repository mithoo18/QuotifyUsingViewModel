package com.example.quotifyusingviewmodel.databindingLiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModelss : ViewModel(){
    //Mutable Live Data can be updated later
    val quoteLiveData =
        MutableLiveData("what you give is what you get")

    fun updateQuote(){
        quoteLiveData.value = "You'll see it what you believe it"

    }

}

/*    <data>
        <variable
            name="mainViewModel"
            type="com.example.quotifyusingviewmodel.databindingLiveData.MainViewModelss"
            />
    </data>
    this is variable which hold our
     viewmodel

jb bhi button click hoga ya call hoga
            android:onClick="@{() -> mainViewModel.updateQuote()}"
mainViewModel.updateQuote
    */