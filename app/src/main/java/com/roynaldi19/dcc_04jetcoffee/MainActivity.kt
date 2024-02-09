package com.roynaldi19.dcc_04jetcoffee

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
import com.roynaldi19.dcc_04jetcoffee.ui.theme.DCC_04JetCoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DCC_04JetCoffeeTheme {
                JetCoffeeApp()

            }
        }
    }
}

@Composable
fun JetCoffeeApp() {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DCC_04JetCoffeeTheme {
        JetCoffeeApp()
    }
}