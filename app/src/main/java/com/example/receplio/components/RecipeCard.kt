package com.example.receplio.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.receplio.R
import com.example.receplio.elements.ArrowButton
import com.example.receplio.elements.RecipeLabel
import com.example.receplio.elements.SquareImage
import com.example.receplio.models.Recipe
import com.example.receplio.ui.theme.Shapes
import com.example.receplio.ui.theme.lightMainColor


val recipe = Recipe("Sandwich", "27 g Protein", "120 Calories", R.drawable.sandwich)
val CardModifier = Modifier
    .fillMaxWidth()
    .padding(10.dp)
    .height(100.dp)
val RowModifier = Modifier.padding(10.dp)
val RecipeLabelModifier = Modifier
    .padding(5.dp, 10.dp, 0.dp, 0.dp)
    .fillMaxWidth(.85f)
val IconButtonModifier = Modifier
    .size(64.dp)
    .padding(0.dp, 20.dp, 0.dp, 0.dp)

@Composable
fun RecipeCard() {
    Card(CardModifier, Shapes.large, lightMainColor)
    {
        Row(RowModifier) {
            SquareImage(recipe.photos, 80.dp)
            RecipeLabel(recipe, RecipeLabelModifier)
            ArrowButton()

        }
    }


}


@Preview
@Composable
fun RecipeCardPreview() {
    RecipeCard()
}