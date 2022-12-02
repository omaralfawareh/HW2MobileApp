package com.example.hw2

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment

class undergraduate: DialogFragment(R.layout.undergraduate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var count:Int = 0
        var courses:String = " "
        val checkBoxval1: CheckBox = view.findViewById(R.id.check1)
        val checkBoxval2: CheckBox = view.findViewById(R.id.check2)
        val checkBoxval3: CheckBox = view.findViewById(R.id.check3)


        view.findViewById<Button>(R.id.cancel2).setOnClickListener{
            dismiss()
        }
        view.findViewById<Button>(R.id.submit2).setOnClickListener{
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