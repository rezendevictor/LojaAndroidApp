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
    private val ArrayCard: ArrayList<Card_Model> ,
    private var ArrayClicks: ArrayList<Int>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    init {
        for (i in ArrayCard){
            ArrayClicks.add(0)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_listitem, parent, false)


        return ViewHolder(view)



    }

    override fun getItemCount(): Int {
        return this.ArrayCard.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val TAG = "RecyclerViewAdapter"
        Log.d(TAG, "onBindViewHolder, called.")




        Glide.with(context)
            .asBitmap()
            .placeholder(R.drawable.ic_launcher_background)
            .load(ArrayCard[position].mImageUrl)
            .into(holder.itemView.image)

        holder.itemView.name.text = ArrayCard[position].mName


        holder.itemView.image.setOnClickListener {


            Log.d(TAG, "onClick, clicked on an image : " + ArrayCard[position].mImageUrl)


            ArrayClicks[position]++



            if (ArrayClicks[position]>0)
            holder.itemView.mark?.visibility = View.VISIBLE
            else{
                holder.itemView.mark?.visibility = View.INVISIBLE
            }

            holder.itemView.mark?.text = ArrayClicks[position].toString()


            Toast.makeText(context,ArrayCard[position].mName, Toast.LENGTH_SHORT).show()





        }


    }

    open class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        var image: CircleImageView = itemView.image
        var name: TextView = itemView.name
        var mark = itemView.mark

    }

}



