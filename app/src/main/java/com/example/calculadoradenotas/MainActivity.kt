package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botaocalcular = bt_calcular
        val resultado = resultado
        botaocalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas <= 10){

               resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas" + faltas)
                resultado.setTextColor(Color.BLUE)
            }else{
                resultado.setText("Aluno foi Reprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas" + faltas)
                resultado.setTextColor(Color.RED)
            }


        }
    }
}