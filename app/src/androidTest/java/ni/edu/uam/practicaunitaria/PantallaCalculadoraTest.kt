package ni.edu.uam.practicaunitaria

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import ni.edu.uam.practicaunitaria.ui.PantallaCalculadora
import org.junit.Rule
import org.junit.Test

class PantallaCalculadoraTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun verificarBotonSumaYResultado() {
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        composeTestRule
            .onNodeWithText("Sumar")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("8")
    }

    @Test
    fun verificarBotonRestaYResultado() {
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        composeTestRule
            .onNodeWithText("Restar")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("6")
    }

    @Test
    fun verificarBotonMultiplicarYResultado() {
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        composeTestRule
            .onNodeWithText("Multiplicar")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("15")
    }

    @Test
    fun verificarBotonDividirYResultado() {
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        composeTestRule
            .onNodeWithText("Dividir")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("5")
    }
}
