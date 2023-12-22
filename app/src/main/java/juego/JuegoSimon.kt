package juego

import android.content.Context
import android.widget.Button
import kotlin.random.Random

class JuegoSimon(val contexto: Context, val btnVerde: Button, val btnRojo: Button,
    val btnAmarillo: Button, val btnAzul: Button) {

    // Atributo estático con el número de botones
    companion object{
        val NUMERO_BOTONES=4
    }

    //Atributos de la clase
    var nivelJuego: Int = 0
    var tamanioSecuencia: Int = 5
    var puntuacion: Int = 0

    // Posicion actual que estamos revisando de la secuencia
    var posActualSecuencia: Int = 0

    // La secuencia del juego es una lista de botones que hay que reproducir
    lateinit var secuenciaJuego: MutableList<BotonJuego>

    // Creamos los 4 botones básicos del juego
    val btnVerdeJuego = BotonJuego(contexto, BotonJuego.VERDE, btnVerde)
    val btnRojoJuego = BotonJuego(contexto, BotonJuego.ROJO, btnRojo)
    val btnAmarilloJuego = BotonJuego(contexto, BotonJuego.AMARILLO, btnAmarillo)
    val btnAzulJuego = BotonJuego(contexto, BotonJuego.AZUL, btnAzul)

    // En el constructor por defecto creamos la secuencia inicial del juego
    init {
        crearSecuenciaJuego()
    }

    /**
     * Método para crear la secuencia de juego actual
     */
    private fun crearSecuenciaJuego() {
        var numBoton: Int
        // Reseteamos la secuencia de Juego => lista vacía
        secuenciaJuego = mutableListOf<BotonJuego>()

        // Sumamos el nivel de juego para ir incrementando en dificultad
        for (i in 1..(tamanioSecuencia + nivelJuego)) {
            // Escogemos un número de botón entre 0 y 3 => "casualmente" los botones del juego
            numBoton = Random.nextInt(JuegoSimon.NUMERO_BOTONES)
            // En función del número de botón añadimos el que corresponde a la secuencia
            when(numBoton){
                BotonJuego.VERDE -> secuenciaJuego.add(btnVerdeJuego)
                BotonJuego.ROJO -> secuenciaJuego.add(btnRojoJuego)
                BotonJuego.AMARILLO -> secuenciaJuego.add(btnAmarilloJuego)
                BotonJuego.AZUL -> secuenciaJuego.add(btnAzulJuego)
            }
        }
    }

}