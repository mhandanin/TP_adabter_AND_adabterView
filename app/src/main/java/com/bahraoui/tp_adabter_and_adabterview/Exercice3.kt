package com.bahraoui.tp_adabter_and_adabterview

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity


class Exercice3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.layout_exercice2)
        val lv=findViewById<ListView>(R.id.lv)

    }
}