package com.example.ejercicio10aleatorizadordeeventos

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityCiudad : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudad)

        findViewById<Button>(R.id.botonContinuar).setOnClickListener{
            val intento = Intent(this,ActivityVacio::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.botonRecoger).setOnClickListener{
            val intento = Intent(this,MainActivity::class.java)
            startActivity(intento)
        }

    }
}