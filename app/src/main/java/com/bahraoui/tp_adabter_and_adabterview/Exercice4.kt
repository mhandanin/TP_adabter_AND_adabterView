package com.bahraoui.tp_adabter_and_adabterview

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity


class Exercice4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.layout_exercice4)

        val lv = findViewById<ListView>(R.id.lv)

        val paysInfos = listOf(
            mapOf("Pays" to "Palestine", "Capitale" to "Al-Qods", "Continent" to "Asie"),
            mapOf("Pays" to "Albanie", "Capitale" to "Tirana", "Continent" to "Europe"),
            mapOf("Pays" to "Algérie", "Capitale" to "Alger", "Continent" to "Afrique"),
            mapOf("Pays" to "Afghanistan", "Capitale" to "Kaboul", "Continent" to "Asie"),
            mapOf("Pays" to "Andorre", "Capitale" to "Andorre-la-Vieille", "Continent" to "Europe"),
            mapOf("Pays" to "Angola", "Capitale" to "Luanda", "Continent" to "Afrique"),
            mapOf("Pays" to "Argentine", "Capitale" to "Buenos Aires", "Continent" to "Amérique")
        )
        val adp = SimpleAdapter(
            this, paysInfos, R.layout.customlayout_exercice4, arrayOf("Pays", "Capitale", "Continent"),
            intArrayOf(R.id.pays, R.id.capital, R.id.continent)
        )
        lv.adapter = adp
    }
}