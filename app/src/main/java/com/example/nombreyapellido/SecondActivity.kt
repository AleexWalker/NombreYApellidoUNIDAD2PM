package com.example.nombreyapellido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nombre = intent.getStringExtra("nombre")
        val apellido = intent.getStringExtra("apellido")

        textView3.text = "¡Hola de nuevo " + apellido + " " + nombre + " nos alegramos de verte por aqui!"
    }
}