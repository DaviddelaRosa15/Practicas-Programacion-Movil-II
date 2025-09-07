package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
        /*enableEdgeToEdge()
        setContent {
            DiceRollerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "David",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }*/
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiceRollerTheme {
        Greeting("David")
    }
}*/