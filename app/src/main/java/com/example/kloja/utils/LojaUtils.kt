package com.example.kloja.utils

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.kloja.R


class LojaUtils {

    var x2: Float = 0F
    var click1: Float = 0F

    fun OnTouchEvent(context: Context, touchevent: MotionEvent, intent: Intent, direita: Boolean) {

        when (touchevent.action) {
            MotionEvent.ACTION_DOWN -> {
                click1 = touchevent.x
            }
            MotionEvent.ACTION_UP -> {
                x2 = touchevent.x
                if (direita) {

                    if (click1 > x2) {
                        alertCustomizedLayout(context, intent)
                    }
                } else {
                    if (click1 < x2)
                        alertCustomizedLayout(context, intent)
                }

            }
        }
    }

    private fun changeCheck(context: Context, intent: Intent) {

        AlertDialog.Builder(context)
            .setTitle("Mudar de Aplicação")
            .setMessage("Voce quer mudar de aplicação?")
            .setPositiveButton("Sim") { dialogInterface: DialogInterface, i: Int ->
                startActivity(context, intent, null)
                var activity = context as Activity
                ActivityCompat.finishAfterTransition(activity)
            }.setNegativeButton("não", null).show()
    }

    fun alertCustomizedLayout(context: Context,intent: Intent) {
        val dialogBuilder = AlertDialog.Builder(context).create()
        val inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val dialogView: View = inflater.inflate(R.layout.dialog_appchange, null)

        val no: Button = dialogView.findViewById(R.id.buttonNo) as Button
        val yes: Button = dialogView.findViewById(R.id.buttonYes) as Button



        no.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                dialogBuilder.dismiss()
            }
        })
        yes.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) { // DO SOMETHINGS
                dialogBuilder.dismiss()
                startActivity(context, intent, null)
                var activity = context as Activity
                ActivityCompat.finishAfterTransition(activity)
            }
        })

        dialogBuilder.setView(dialogView)
        dialogBuilder.show()
    }




}



