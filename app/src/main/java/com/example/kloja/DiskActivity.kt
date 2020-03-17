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


class DiskActivity : AppCompatActivity() {

    var ArrayCard = arrayListOf<Card_Model>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getImages()

        try {
            pagar.setOnClickListener { startActivity<PagamentoActivity>() }

            clear.setOnClickListener {
                for (x in ArrayCard){
                    x.clicks = 0
                }
                initRecyclerView()
            }


        }catch (e : Exception){
            Log.d("Cheguei",e.toString())
        }





        }

    private fun getImages() {

        ArrayCard.add(Card_Model("Thriller","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/jackson_thriller-1.jpg",0))
        ArrayCard.add(Card_Model("Appetite for Destruction","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/gnrappetitefordestruction.jpg",0))
        ArrayCard.add(Card_Model(" Metallica","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Metallica_-_Metallica_cover.jpg",0))
        ArrayCard.add(Card_Model("…Baby One More Time","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/spearsonemoretime.png",0))
        ArrayCard.add(Card_Model("Slippery When Wet","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Bon_jovi_slippery_when_wet.jpg",0))
        ArrayCard.add(Card_Model( "The Woman In Me","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Shania_Twain_-_The_Woman_in_Me.png",0))
        ArrayCard.add(Card_Model("James Taylor’s Greatest Hits","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/James_Taylor_-_Greatest_Hits.jpg",0))
        ArrayCard.add(Card_Model("‘N Sync","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/nsync.jpg",0))
        ArrayCard.add(Card_Model("Pyromania","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Def_Leppard_-_Pyromania.jpg",0))
        ArrayCard.add(Card_Model("Sevens","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/sevens.jpg",0))
        ArrayCard.add(Card_Model("Thriller","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/jackson_thriller-1.jpg",0))
        ArrayCard.add(Card_Model("Appetite for Destruction","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/gnrappetitefordestruction.jpg",0))
        ArrayCard.add(Card_Model(" Metallica","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Metallica_-_Metallica_cover.jpg",0))
        ArrayCard.add(Card_Model("…Baby One More Time","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/spearsonemoretime.png",0))
        ArrayCard.add(Card_Model("Slippery When Wet","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Bon_jovi_slippery_when_wet.jpg",0))
        ArrayCard.add(Card_Model( "The Woman In Me","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Shania_Twain_-_The_Woman_in_Me.png",0))
        ArrayCard.add(Card_Model("James Taylor’s Greatest Hits","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/James_Taylor_-_Greatest_Hits.jpg",0))
        ArrayCard.add(Card_Model("‘N Sync","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/nsync.jpg",0))
        ArrayCard.add(Card_Model("Pyromania","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Def_Leppard_-_Pyromania.jpg",0))
        ArrayCard.add(Card_Model("Sevens","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/sevens.jpg",0))
        ArrayCard.add(Card_Model("Thriller","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/jackson_thriller-1.jpg",0))
        ArrayCard.add(Card_Model("Appetite for Destruction","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/gnrappetitefordestruction.jpg",0))
        ArrayCard.add(Card_Model(" Metallica2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Metallica_-_Metallica_cover.jpg",0))
        ArrayCard.add(Card_Model("…Baby One More Time2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/spearsonemoretime.png",0))
        ArrayCard.add(Card_Model("Slippery When Wet2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Bon_jovi_slippery_when_wet.jpg",0))
        ArrayCard.add(Card_Model( "The Woman In Me2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Shania_Twain_-_The_Woman_in_Me.png",0))
        ArrayCard.add(Card_Model("James Taylor’s Greatest Hits2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/James_Taylor_-_Greatest_Hits.jpg",0))
        ArrayCard.add(Card_Model("‘N Sync2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/nsync.jpg",0))
        ArrayCard.add(Card_Model("Pyromania2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/Def_Leppard_-_Pyromania.jpg",0))
        ArrayCard.add(Card_Model("Sevens2","https://www.digitalmusicnews.com/wp-content/uploads/2017/02/sevens.jpg",0))

        initRecyclerView()
    }



    private fun initRecyclerView() {

        val recicle = recyclerView
        recicle.layoutManager = GridLayoutManager(this,3)
        val adapter = RecyclerViewAdapter(this,ArrayCard)
        recicle.adapter = adapter

    }
}
