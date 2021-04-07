package com.juanrios66.myfinances

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("metodo","onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("metodo","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("metodo","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("metodo","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("metodo","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("metodo","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("metodo","onDestroy")
    }
}