package com.bahraoui.tp_adabter_and_adabterview

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity


class Exercice5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.layout_exercice5)

        val lv = findViewById<ListView>(R.id.lv)


        val listePersonnes = arrayListOf(
            hashMapOf("nom" to "ALAMI", "prenom" to "Mohammed", "age" to "38"),
            hashMapOf("nom" to "ALAOUI", "prenom" to "Taha", "age" to "65"),
            hashMapOf("nom" to "IQBAL", "prenom" to "Imane", "age" to "15"),
            hashMapOf("nom" to "ALAMI", "prenom" to "Nada", "age" to "24"),
            hashMapOf("nom" to "SELLAM", "prenom" to "Issam", "age" to "12")
        )

        val adapter = customAdabter_exercice5(this, listePersonnes)
        lv.adapter = adapter
    }
}