package com.example.kloja

import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kloja.models.Card_Model
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_listitem.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity
import java.lang.Exception
import java.util.EnumSet.range


class MainActivity : AppCompatActivity() {

    var ArrayClicks = arrayListOf(0)
    var ArrayCard = arrayListOf<Card_Model>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getImages()

        try {
            pagar.setOnClickListener { startActivity<PagamentoActivity>() }

            clear.setOnClickListener {
                ArrayClicks.clear()
                initRecyclerView()


            }


        }catch (e : Exception){
            Log.d("Cheguei",e.toString())
        }





        }

    private fun getImages() {

        ArrayCard.add(Card_Model("David Bowie","https://coverartworks.com/shop/unseen-presence/",0))
        ArrayCard.add(Card_Model("David Bowie","https://coverartworks.com/shop/unseen-presence/",0))
        ArrayCard.add(Card_Model("David Bowie","https://coverartworks.com/shop/unseen-presence/",0))
        ArrayCard.add(Card_Model("David Bowie","https://coverartworks.com/shop/unseen-presence/",0))
        ArrayCard.add(Card_Model("David Bowie","https://coverartworks.com/shop/unseen-presence/",0))
        ArrayCard.add(Card_Model("David Bowie","https://coverartworks.com/shop/unseen-presence/",0))
        ArrayCard.add(Card_Model("David Bowie","https://coverartworks.com/shop/unseen-presence/",0))


        initRecyclerView()
    }



    private fun initRecyclerView() {

        val recicle = recyclerView
        recicle.layoutManager = GridLayoutManager(this,3)
        val adapter = RecyclerViewAdapter(this,ArrayCard,ArrayClicks)
        recicle.adapter = adapter

    }
}
