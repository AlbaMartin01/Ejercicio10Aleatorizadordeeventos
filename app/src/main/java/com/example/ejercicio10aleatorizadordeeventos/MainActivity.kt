package com.example.ejercicio10aleatorizadordeeventos

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dado = 0

        findViewById<ImageButton>(R.id.botonDado).setOnClickListener{
            dado = (1..4).random()
            if (dado == 1){
                val intento = Intent(this,ActivityObjeto::class.java)
                startActivity(intento)
            } else if (dado == 2){
                val intento = Intent(this, ActivityObjeto::class.java)
                startActivity(intento)
            } else if (dado == 3){
                val intento = Intent(this, ActivityMercader::class.java)
                startActivity(intento)
            } else if (dado == 4){
                val intento = Intent(this,ActivityEnemigo::class.java)
                startActivity(intento)
            }
        }

    }
}