package com.example.aula_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        println("LifeCycle: onStart")
    }

    override fun onResume() {
        super.onResume()
        println("LifeCycle: onResume")
    }

    override fun onPause() {
        super.onPause()
        println("LifeCycle: onPause")
    }

    override fun onStop() {
        super.onStop()
        println("LifeCycle: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        println("LifeCycle: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("LifeCycle: onDestroy")
    }

}

