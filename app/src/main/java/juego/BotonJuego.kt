package juego

import android.content.Context
import android.media.MediaPlayer
import android.widget.Button
import com.ilerna.simon_ilerna.R

/**
 * Clase Botón de Juego que representa el botón que usamos en el propio juego
 */
class BotonJuego(val context: Context, val color:Int, val boton: Button) {
    // Variables estáticas para representar los 4 colores que tenemos
    companion object {
        val VERDE=0
        val ROJO=1
        val AMARILLO=2
        val AZUL=3
    }
    // Atributo duración sonido 2s
    val duracionSonido: Long = 2000
    lateinit var sonido: MediaPlayer

    // En función del color le asignamos un sonido
    init{
        // Forma de hacer un switch en Kotlin
        when(color){
            BotonJuego.VERDE -> sonido = MediaPlayer.create(context, R.raw.btnverde)
            BotonJuego.ROJO -> sonido = MediaPlayer.create(context, R.raw.btnrojo)
            BotonJuego.AMARILLO -> sonido = MediaPlayer.create(context, R.raw.btnamarillo)
            BotonJuego.AZUL -> sonido = MediaPlayer.create(context, R.raw.btnazul)
        }
    }

    /**
     * Función para reproducir el sonido en base al tipo de botón
     */
    fun reproducirSonido(){
        sonido.start()
        Thread.sleep(duracionSonido)
        sonido.stop()
    }

}