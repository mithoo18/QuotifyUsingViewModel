package com.example.quotifyusingviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.quotifyusingviewmodel.databinding.ActivityMainBinding
import com.example.quotifyusingviewmodel.databindingLiveData.MainViewModelss
import com.example.quotifyusingviewmodel.livedata.MainViewModels
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
lateinit var binding : ActivityMainBinding
lateinit var mainViewModel: MainViewModelss

    //TODO 2 BRANCH
    /*lateinit var mainViewModel : MainViewModels

    private val factsTextView : TextView
    //This is a getter
    get() = findViewById(R.id.txtCounter)

    private val btnUpdate : FloatingActionButton
        //This is a getter
        get() = findViewById(R.id.floatingActionButton)*/


    //TODO 1 BRANCH
    /*
    lateinit var txtCounter : TextView //counterText
    lateinit var floatingActionButton : FloatingActionButton //counterText
    lateinit var mainViewModel : MainViewModel //ViewModel hai
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO 1 BRANCH & 2 BRANCH
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        /* Intialize */
        mainViewModel = ViewModelProvider(this).get(MainViewModelss::class.java)



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

    //TODO 2 BRANCH

    /*
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
    */

    /*
    TODO 10 BECAUSE OF THIS WE REMOVE THIS SO IT DON'T KNOW LIFECYCE
    mainViewModel.quoteLiveData.observe(this, Observer {
                    binding.txtCounter.text = it
            })*/

    //AB HAMA BINDING VAL KO SET KARNA HAI JO LAYOUT DEFNE KIYA TGHA
/*        <data>
        <variable
        name="mainViewModel"
        type="com.example.quotifyusingviewmodel.databindingLiveData.MainViewModelss"
        />
        </data>*/
    binding.mainViewModel = mainViewModel
    //TODO CHECK 10
    binding.lifecycleOwner = this

    }
}