package com.example.kloja.utils

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.MotionEvent
import androidx.core.content.ContextCompat.startActivity


class LojaUtils {

    var result: Boolean = false
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
                        changeCheck(context,intent)
                    }
                } else {
                    if (click1 < x2)
                        changeCheck(context,intent)
                }
            }


        }


    }

    private fun changeCheck(context: Context, intent: Intent) {

        AlertDialog.Builder(context)
            .setTitle("Mudar de Aplicação")
            .setMessage("Voce quer mudar de aplicação?")
            .setPositiveButton("Sim") { dialogInterface: DialogInterface, i: Int ->
                startActivity(context, intent,null)
            }.setNegativeButton("não", null).show()


    }


}

