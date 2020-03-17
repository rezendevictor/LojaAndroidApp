package com.example.kloja

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kloja.API.Moeda
import kotlinx.android.synthetic.main.layout_liststocks.view.*


class RecyclerViewAdapterStocks(
    private val context: Context,
    private val money: ArrayList<Moeda>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_liststocks, parent, false)

        return ViewHolder(view)


    }

    override fun getItemCount(): Int {
        return this.money.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val TAG = "RecyclerViewAdapter"
        Log.d(TAG, "onBindViewHolder, called.")

        try {

                holder.itemView.name.text = money[position].rate.To_currency_Name
                holder.itemView.code.text = money[position].rate.To_currency_Code
                holder.itemView.rate.text = money[position].rate.Exchange_rate.toString()


    }catch (e: Exception){
        var ex = e.message
        System.out.println(ex);

    }


    }

    open class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        var name = itemView.name
        var code = itemView.code
        var rate = itemView.rate


    }


}

