package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = button
        val resultado = resultado

        button.setOnClickListener {
            val nota1: Int = Integer.parseInt(nota1.text.toString())
            val nota2: Int = Integer.parseInt(nota2.text.toString())
            val faltas: Int = Integer.parseInt(faltas.text.toString())
            val media: Int = (nota1 + nota2)/2

            if(media>=6 && faltas<=10) {
                resultado.setText("O aluno foi Aprovado\nNota final: $media\nFaltas:$faltas")
                resultado.setTextColor(Color.GREEN)
            } else{
                resultado.setText("O aluno foi Reprovado\nNota final: $media\nFaltas:$faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}