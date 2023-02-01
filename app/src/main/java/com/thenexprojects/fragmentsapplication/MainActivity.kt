package com.thenexprojects.fragmentsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.thenexprojects.fragmentsapplication.fragments.FirstFragment
import com.thenexprojects.fragmentsapplication.fragments.SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyTagHere", "onDestroy: ")
    }
    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }
*/

    fun addFirstFragment(text: String, shouldBeOnBackstack: Boolean){
        val transaction = supportFragmentManager.beginTransaction()
        val firstFragment = FirstFragment()
        val arguments = Bundle()
        arguments.putString("textForFirstFragment", text)
        firstFragment.arguments = arguments
        transaction.replace(R.id.container, firstFragment, null)
        if(shouldBeOnBackstack) transaction.addToBackStack("FirstFragment")
        transaction.commit()
    }

    fun addSecondFragment(text: String, shouldBeOnBackstack: Boolean){
        val transaction = supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        val arguments = Bundle()
        arguments.putString("textForSecondFragment", text)
        secondFragment.arguments = arguments
        transaction.replace(R.id.container, secondFragment, null)
        if(shouldBeOnBackstack) transaction.addToBackStack("SecondFragment")
        transaction.commit()
    }
}