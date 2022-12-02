package com.example.hw2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class graduate: DialogFragment(R.layout.graduate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var count:Int = 0
        var courses:String = " "
        val checkBoxval1:CheckBox = view.findViewById(R.id.check1)
        val checkBoxval2:CheckBox = view.findViewById(R.id.check2)
        val checkBoxval3:CheckBox = view.findViewById(R.id.check3)


        view.findViewById<Button>(R.id.cancel1).setOnClickListener{
            dismiss()
        }
        view.findViewById<Button>(R.id.submit1).setOnClickListener{
            if (checkBoxval1.isChecked()){
                ++count
                courses += " " + checkBoxval1.text
            }
            if (checkBoxval2.isChecked()){
                ++count
                courses += "," + checkBoxval2.text

            }
            if (checkBoxval3.isChecked()){
                ++count
                courses += "," + checkBoxval3.text
            }
            val m1:MainActivity = getActivity() as MainActivity
            m1.receiveFeed2(count,courses)
            dismiss()
        }


    }
}