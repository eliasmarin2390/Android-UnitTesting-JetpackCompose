package ni.edu.uam.practicaunitaria.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import ni.edu.uam.practicaunitaria.Calculadora

@Composable
fun PantallaCalculadora() {

    val calculadora = Calculadora()
    var resultado by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {

        Row(modifier = Modifier.padding(bottom = 8.dp)) {
            Button(
                onClick = {
                    resultado = calculadora.sumar(5, 3).toString()
                },
                modifier = Modifier.padding(end = 8.dp)
            ) {
                Text("Sumar")
            }

            Button(
                onClick = {
                    resultado = calculadora.restar(10, 4).toString()
                }
            ) {
                Text("Restar")
            }
        }

        Row {
            Button(
                onClick = {
                    resultado = calculadora.multiplicar(5, 3).toString()
                },
                modifier = Modifier.padding(end = 8.dp)
            ) {
                Text("Multiplicar")
            }

            Button(
                onClick = {
                    resultado = calculadora.dividir(10, 2).toString()
                }
            ) {
                Text("Dividir")
            }
        }

        Text(
            text = resultado,
            modifier = Modifier
                .testTag("resultado")
                .padding(top = 16.dp)
        )
    }
}
