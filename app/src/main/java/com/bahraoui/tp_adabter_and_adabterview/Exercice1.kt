package com.bahraoui.tp_adabter_and_adabterview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Exercice1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.layout_exercice1)
        val lv=findViewById<ListView>(R.id.lv)

        val languageProgrammation=listOf("java","javascript","kotlin","php","python","swift")

        /*-----------------------------Question 1-----------------------------*/

//        val adp1=ArrayAdapter(this,android.R.layout.simple_list_item_1,languageProgrammation)
//        lv.adapter=adp1



        /*-----------------------------Question 2-----------------------------*/

//        val adp2=ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,languageProgrammation)
//        lv.adapter=adp2
//        lv.choiceMode=ListView.CHOICE_MODE_SINGLE



        /*-----------------------------Question 3-----------------------------*/

        val adp3=ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,languageProgrammation)
        lv.adapter=adp3
        lv.choiceMode=ListView.CHOICE_MODE_MULTIPLE
    }
}