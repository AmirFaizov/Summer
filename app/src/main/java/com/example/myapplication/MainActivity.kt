package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var name: EditText?=null
    private var growth: EditText?=null
    private var weight: EditText?=null
    private var age: EditText?=null
    private var text_button:Button?=null
    private var result:TextView?=null
    var formula:Double = 2.7;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.editText2)
        result = findViewById(R.id.TextView)
        growth = findViewById(R.id.editText3)
        weight = findViewById(R.id.editText4)
        age = findViewById(R.id.editText)
        text_button = findViewById(R.id.button)
        text_button?.setOnClickListener{
            if(name?.text?.toString()?.equals("")==true || 0 > weight?.text.toString().toDouble() ||
                weight?.text.toString().toDouble() > 250 ||0 > age?.text.toString().toDouble() ||
                age?.text.toString().toDouble() > 150 || 0 > growth?.text.toString().toDouble() || growth?.text.toString().toDouble() > 250
            ){
                result?.text = "Данные введены некорректно."}
            else{
                formula = weight?.text.toString().toDouble()+age?.text.toString().toDouble()+growth?.text.toString().toDouble()+name?.text.toString().hashCode()
                result?.text = "Ответ" + " " + formula.toString()
            }
        }
    }}