package com.example.receplio.elements

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.receplio.components.recipe
import com.example.receplio.models.Recipe
import com.example.receplio.ui.theme.Typography
import com.example.receplio.ui.theme.mainColor

@Composable
fun RecipeLabel(recipe: Recipe, modifier: Modifier) {
    Column(modifier = modifier)
    {
        Text(text = recipe.name, style = Typography.h6)
        Row(
            modifier = Modifier
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = recipe.protein, style = Typography.body1)
            Dote(mainColor)
            Text(text = recipe.calories, style = Typography.body1)
        }

    }
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun RecipeLabelPreview() {
    val modifier = Modifier
        .padding(5.dp, 10.dp, 0.dp, 0.dp)
        .fillMaxWidth()
        .height(100.dp)
    RecipeLabel(recipe, modifier)
}