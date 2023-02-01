package com.thenexprojects.fragmentsapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.thenexprojects.fragmentsapplication.MainActivity
import com.thenexprojects.fragmentsapplication.R
class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val button = view.findViewById<Button>(R.id.btn)
        val editText = view.findViewById<EditText>(R.id.edit)

        button.setOnClickListener {


            val transaction = parentFragmentManager.beginTransaction()
            if(activity is MainActivity){
                (activity as MainActivity).addFirstFragment(editText.text.toString(), false)
            }
        }

        return view
    }
}