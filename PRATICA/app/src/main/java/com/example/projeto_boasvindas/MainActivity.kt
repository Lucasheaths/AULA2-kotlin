package com.example.projeto_boasvindas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun boasVindas(view: View){

        val msg: TextView = findViewById(R.id.mostrarBoasVindas)
        val nome: EditText = findViewById(R.id.nome)
        val letras: TextView = findViewById(R.id.letras)
        //val sauda: EditText = findViewById(R.id.sauda)

        msg.text = "" + nome.text + "\nSeu nome possui: " + letras.text + " letras."


    }
}