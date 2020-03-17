package com.example.kloja

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kloja.models.Card_Model
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.layout_listitem.view.*


class RecyclerViewAdapter(
    private val context: Context,
    private val ArrayCard: ArrayList<Card_Model>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_listitem, parent, false)
        return ViewHolder(view)


    }

    override fun getItemCount(): Int {
        return this.ArrayCard.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        Glide.with(context)
            .asBitmap()
            .placeholder(R.drawable.ic_launcher_background)
            .load(ArrayCard[position].mImageUrl)
            .into(holder.itemView.image)

        holder.itemView.name.text = ArrayCard[position].mName

        holder.itemView.Item_layout.setOnClickListener {
            ArrayCard[position].clicks++
            holder.itemView.mark?.text = ArrayCard[position].clicks.toString()
            holder.itemView.mark?.visibility = View.VISIBLE
        }

        holder.itemView.mark?.text = ArrayCard[position].clicks.toString()
        if (ArrayCard[position].clicks<=0){
            holder.itemView.mark?.visibility = View.INVISIBLE
        }else{
            holder.itemView.mark?.visibility = View.VISIBLE
        }

    }

    open class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        var image: CircleImageView = itemView.image
        var name: TextView = itemView.name
        var mark = itemView.mark
        var fulllayouy = itemView.Item_layout
    }

}



