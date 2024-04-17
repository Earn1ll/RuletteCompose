package ru.earn1ll.rulettecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.earn1ll.rulettecompose.rulette_screen.RuletteScreen
import ru.earn1ll.rulettecompose.ui.theme.GreenBg
import ru.earn1ll.rulettecompose.ui.theme.RuletteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RuletteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenBg
                ) {
                    RuletteScreen()
                }
            }
        }
    }
}
