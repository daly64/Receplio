package com.example.receplio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.receplio.ui.theme.cardBackgroundColor


@Composable
fun RecipeCard() {
    Row(Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            elevation = 4.dp,
            shape = RoundedCornerShape(10.dp),
            backgroundColor = cardBackgroundColor
        ) {

            Image(
                modifier = Modifier
                    .size(1.dp),
                painter = painterResource(R.drawable.sandwich),
                contentDescription = null,
            )
            Text(text = stringResource(id = R.string.app_name))
        }

    }
}

@Preview
@Composable
fun RecipeCardPreview() {
    RecipeCard()
}