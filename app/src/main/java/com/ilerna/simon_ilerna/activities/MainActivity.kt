package com.ilerna.simon_ilerna.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ilerna.simon_ilerna.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Creamos la actividad de forma habitual
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cogemos el btnListadoPuntos y lanzamos la activity con los puntos
        val btnListadoPuntos = findViewById<Button>(R.id.btnListadoPuntos)
        btnListadoPuntos.setOnClickListener {
            startActivity(Intent(this, ListadoPuntosActivity::class.java))
        }

        // Cogemos el btnJuego y lanzamos la partida
        val btnJuego = findViewById<Button>(R.id.btnComenzarJuego)
        btnJuego.setOnClickListener {
            startActivity(Intent(this, JuegoActivity::class.java))
        }

    }
}