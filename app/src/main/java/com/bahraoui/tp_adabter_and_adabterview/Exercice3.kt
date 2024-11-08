package com.bahraoui.tp_adabter_and_adabterview

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity


class Exercice3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.layout_exercice3)
        val lv=findViewById<ListView>(R.id.affichage)

        val listPays = listOf(
            mapOf("pays" to "Palestine", "monnaie" to "Pound", "iso" to "PP"),
            mapOf("pays" to "Algérie", "monnaie" to "Dinar algérien", "iso" to "DZD"),
            mapOf("pays" to "Afghanistan", "monnaie" to "Afghani", "iso" to "AFN"),
            mapOf("pays" to "Arabie Saoudite", "monnaie" to "Riyal saoudien", "iso" to "SAR"),
            mapOf("pays" to "Belgique", "monnaie" to "Euro", "iso" to "EUR"),
            mapOf("pays" to "Bénin", "monnaie" to "Franc CFA", "iso" to "XOF"),
            mapOf("pays" to "Brésil", "monnaie" to "Réal brésilien", "iso" to "BRL"),
            mapOf("pays" to "Côte d'Ivoire", "monnaie" to "Franc CFA", "iso" to "XOF")
        )


        val adapter=SimpleAdapter(this,listPays,R.layout.customlayout_exercice3, arrayOf("pays","monnaie","iso"),
            intArrayOf(R.id.nomPays,R.id.monnaie,R.id.iso))
        lv.adapter=adapter
    }
}