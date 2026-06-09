package ni.edu.uam.practicaunitaria

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraTest {

    @Test
    fun verificarSuma() {

        val calculadora = Calculadora()

        val resultado = calculadora.sumar(5, 5)

        assertEquals(10, resultado)
    }
}
