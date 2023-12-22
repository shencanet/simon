package com.ilerna.simon_ilerna.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import com.ilerna.simon_ilerna.R

class JuegoActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        //Cogemos todos los botones de la Activity
        var btnAtras = findViewById<ImageButton>(R.id.btnJuegoAtras)
        var btnVerde = findViewById<Button>(R.id.btnVerde)
        var btnRojo = findViewById<Button>(R.id.btnRojo)
        var btnAmarillo = findViewById<Button>(R.id.btnAmarillo)
        var btnAzul = findViewById<Button>(R.id.btnAzul)

        // Programamos el evento onClick para el botón atrás
        btnAtras.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        // Programamos los eventos OnTouchListener para los botones del Juego

        btnVerde.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Acciones cuando el botón se presiona
                    btnVerde.setBackgroundColor(ContextCompat.getColor(this, R.color.verdeLuz))
                }
                MotionEvent.ACTION_UP -> {
                    // Acciones cuando el botón se suelta
                    btnVerde.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                }
            }
            true
        }

        btnRojo.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Acciones cuando el botón se presiona
                    btnRojo.setBackgroundColor(ContextCompat.getColor(this, R.color.rojoLuz))
                }
                MotionEvent.ACTION_UP -> {
                    // Acciones cuando el botón se suelta
                    btnRojo.setBackgroundColor(ContextCompat.getColor(this, R.color.rojo))
                }
            }
            true
        }

        btnAmarillo.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Acciones cuando el botón se presiona
                    btnAmarillo.setBackgroundColor(ContextCompat.getColor(this, R.color.amarilloLuz))
                }
                MotionEvent.ACTION_UP -> {
                    // Acciones cuando el botón se suelta
                    btnAmarillo.setBackgroundColor(ContextCompat.getColor(this, R.color.amarillo))
                }
            }
            true
        }

        btnAzul.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Acciones cuando el botón se presiona
                    btnAzul.setBackgroundColor(ContextCompat.getColor(this, R.color.azulLuz))
                }
                MotionEvent.ACTION_UP -> {
                    // Acciones cuando el botón se suelta
                    btnAzul.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                }
            }
            true
        }

    }
}