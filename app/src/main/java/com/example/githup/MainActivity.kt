package com.example.githup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var value: Response<List<Boolean>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("This is remote base")
        println("Helllo there")
        Log.d("", "")
        value = Response.Success<List<Boolean>>(listOf(true, false))
        value = Response.Loading()
        value = Response.Error<List<Boolean>>(null, "Error")
        when (value) {
            is Response.Success -> {

            }
            is Response.Loading -> {
                Toast.makeText(this, "Hello there ", Toast.LENGTH_SHORT).show()
            }
            is Response.Error -> {

            }
        }
        println("My New Commit")
        println("Add new Feature")

    }

}