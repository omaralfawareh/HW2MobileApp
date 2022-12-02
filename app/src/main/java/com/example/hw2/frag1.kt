package com.example.hw2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class frag1: DialogFragment(R.layout.frag1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancel);
        val submitbt : Button = view.findViewById(R.id.submit);
        val radioGroup = view.findViewById<RadioGroup>(R.id.RadioGroup)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            var flag:Int = 1
            if (radioButton.text == "Graduate"){
                flag = 2
            }else{
               flag = 1
            }
            val m1:MainActivity = getActivity() as MainActivity
            m1.receiveFeed(flag)
            dismiss()
        }
    }
}