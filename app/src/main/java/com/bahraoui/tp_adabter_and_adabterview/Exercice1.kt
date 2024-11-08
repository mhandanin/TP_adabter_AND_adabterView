package com.bahraoui.tp_adabter_and_adabterview

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.service.controls.actions.FloatAction
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Exercice1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.layout_exercice1)
        val lv = findViewById<ListView>(R.id.lv)
        val FAB = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        Toast.makeText(this, "Exercice 1", Toast.LENGTH_SHORT).show()

        val languageProgrammation = listOf("java", "javascript", "kotlin", "php", "python", "swift")

        /*-----------------------------Question 1-----------------------------*/

//        val adp1=ArrayAdapter(this,android.R.layout.simple_list_item_1,languageProgrammation)
//        lv.adapter=adp1


        /*-----------------------------Question 2-----------------------------*/

//        val adp2=ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,languageProgrammation)
//        lv.adapter=adp2
//        lv.choiceMode=ListView.CHOICE_MODE_SINGLE


        /*-----------------------------Question 3-----------------------------*/

        val adp3 = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_multiple_choice,
            languageProgrammation
        )
        lv.adapter = adp3
        lv.choiceMode = ListView.CHOICE_MODE_MULTIPLE


        FAB.setOnClickListener {
            val intent = Intent(this@Exercice1, Exercice2::class.java)
            startActivity(intent)
        }
    }
}