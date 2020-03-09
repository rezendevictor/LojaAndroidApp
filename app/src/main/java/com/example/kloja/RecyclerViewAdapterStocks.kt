package com.example.kloja

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_liststocks.view.*

class RecyclerViewAdapterStocks(
    private val context: Context,
    private val money: ArrayList<String>
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

        holder.itemView.name.text = money[position]
        holder.itemView.code.text = money[position]
        holder.itemView.rate.text = money[position]


    }

    open class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        var name = itemView.name
        var code = itemView.code
        var rate = itemView.rate


    }


}

