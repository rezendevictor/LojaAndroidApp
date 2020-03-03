package com.example.kloja

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kloja.utils.LojaUtils
import kotlinx.android.synthetic.main.activity_entrada2.*

class SecondActivity : AppCompatActivity() {

    private var utils = LojaUtils()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrada2)

        tela2.setOnTouchListener{ v : View,
                                  m : MotionEvent ->


            utils.OnTouchEvent(this,m,
                Intent(this,MainActivity::class.java),false
            )
            true
        }

    }


}