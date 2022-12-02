package com.example.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun receiveFeed(a:Int){
        if(a == 2){
            val dialog_val = graduate()
            dialog_val.show(supportFragmentManager, "")
        }else{
            val dialog_val = undergraduate()
            dialog_val.show(supportFragmentManager, "")
        }
    }
    fun receiveFeed2(count:Int, courses:String){
        findViewById<TextView>(R.id.textView4).text = "Course number = $count  Courses:" + courses
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       var dialog_var = frag1()
        dialog_var.show(supportFragmentManager, "")

        return super.onOptionsItemSelected(item)
    }
}