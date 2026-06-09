package ni.edu.uam.practicaunitaria

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraTest {

    private val calculadora = Calculadora()

    @Test
    fun verificarSuma() {
        assertEquals(8, calculadora.sumar(5, 3))
    }

    @Test
    fun verificarResta() {
        assertEquals(6, calculadora.restar(10, 4))
    }

    @Test
    fun verificarMultiplicacion() {
        assertEquals(15, calculadora.multiplicar(5, 3))
    }

    @Test
    fun verificarDivision() {
        assertEquals(2, calculadora.dividir(10, 5))
    }

    @Test
    fun verificarNumerosNegativos() {
        assertEquals(-2, calculadora.sumar(-5, 3))
        assertEquals(-8, calculadora.restar(-5, 3))
        assertEquals(-15, calculadora.multiplicar(-5, 3))
        assertEquals(-2, calculadora.dividir(-10, 5))
    }

    @Test(expected = IllegalArgumentException::class)
    fun verificarDivisionPorCero() {
        calculadora.dividir(10, 0)
    }

    @Test
    fun pruebaFallaIntencional() {
        // Esta prueba fallará porque 2 + 2 no es 5
        // Se usa para demostrar cómo el sistema de pruebas detecta errores
        assertEquals("La suma de 2 + 2 debería ser 4", 5, calculadora.sumar(2, 2))
    }
}
