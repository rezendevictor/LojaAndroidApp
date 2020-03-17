package com.example.kloja

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kloja.API.API_consume
import com.example.kloja.API.Moeda
import kotlinx.android.synthetic.main.activity_stocks.*
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

class StocksActivity : AppCompatActivity() {
    val service by lazy {
        API_consume()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stocks)
        callService()
        initRecyclerView()

    }


    private fun callService(): ArrayList<Moeda> {

        val lista = arrayListOf<Moeda>()
        try {

                var x = "USD"
                runBlocking {
                    val result = async {

                        service.get_moeda().getMoeda(x, "USD")}.await()

                    if (result.isSuccessful) {
                        lista.add(result.body() as Moeda)
                    }
                }



        } catch (e: Exception) {
            print(e.message)
        }
        return lista
    }


    private fun initRecyclerView() {
        val recicle = stock
        recicle.layoutManager = GridLayoutManager(this, 3)
        val listValores =  callService()
        val adapter = RecyclerViewAdapterStocks(this, listValores)
        recicle.adapter = adapter

    }
}
