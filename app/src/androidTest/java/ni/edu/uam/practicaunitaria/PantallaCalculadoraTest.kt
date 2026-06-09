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
    fun verificarBotonYResultado() {

        composeTestRule.setContent {
            PantallaCalculadora()
        }

        composeTestRule
            .onNodeWithText("Calcular")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("10")
    }
}
