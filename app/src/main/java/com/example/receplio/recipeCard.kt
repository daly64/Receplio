package com.example.receplio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.receplio.ui.theme.Shapes
import com.example.receplio.ui.theme.cardBackgroundColor


@Composable
fun RecipeCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(100.dp),
        shape = Shapes.large,
        backgroundColor = cardBackgroundColor
    )
    {
        Row(modifier = Modifier.padding(10.dp)) {
            Card(
                modifier = Modifier.size(80.dp),
                shape = Shapes.medium,
            ) {
                Image(
                    painter =
                    painterResource(id = R.drawable.sandwich),
                    contentDescription = stringResource(id = R.string.sandwich),
                    contentScale = ContentScale.FillBounds
                )
            }

        }


    }

}


@Preview
@Composable
fun RecipeCardPreview() {
    RecipeCard()
}