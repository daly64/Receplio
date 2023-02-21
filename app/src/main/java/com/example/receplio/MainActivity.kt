package com.example.receplio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.example.receplio.components.RecipeCard
import com.example.receplio.ui.theme.ReceplioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReceplioTheme {
                // A surface container using the 'background' color from the theme
                Column() {
                    RecipeCard()
                    RecipeCard()
                    RecipeCard()
                    RecipeCard()
                    RecipeCard()
                }
            }
        }
    }
}
