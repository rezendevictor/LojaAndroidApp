package com.example.kloja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kloja.API.moneys
import com.example.kloja.models.Card_Model
import kotlinx.android.synthetic.main.activity_stocks.*
import java.lang.Exception


class StocksActivity : AppCompatActivity() {
    var tt = arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stocks)
        initRecyclerView()

    }


    private fun initRecyclerView() {
        val money = moneys()
        val recicle = stock

        recicle.layoutManager = GridLayoutManager(this,3)
        try {
            val adapter = RecyclerViewAdapterStocks(this, money)
            recicle.adapter = adapter

        }catch (e : Exception){
            print(e.message)
        }

    }
}
