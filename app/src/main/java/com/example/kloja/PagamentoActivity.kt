package com.example.kloja

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_payment.*


class PagamentoActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        Debito.setOnClickListener {

            Toast.makeText(this, "Debito", Toast.LENGTH_SHORT).show()
        }

        Dinheiro.setOnClickListener {


            Toast.makeText(this, "Dinheiro", Toast.LENGTH_SHORT).show()
        }

        Credito.setOnClickListener {

            Toast.makeText(this, "Credito", Toast.LENGTH_SHORT).show()
        }


    }


}