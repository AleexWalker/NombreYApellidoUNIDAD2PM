package com.example.nombreyapellido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editTextTextPersonName.text.isEmpty() || editTextTextPersonName2.text.isEmpty())
                Toast.makeText(this, "¡Introduce los datos requeridos!", Toast.LENGTH_SHORT).show()
            else {
                val nombre: String = editTextTextPersonName.text.toString()
                val apellido: String = editTextTextPersonName2.text.toString()

                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("nombre", nombre)
                    putExtra("apellido", apellido)
                }
                startActivity(intent)
            }
        }
    }
}