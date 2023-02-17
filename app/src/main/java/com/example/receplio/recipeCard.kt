package com.example.receplio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.receplio.ui.theme.Shapes
import com.example.receplio.ui.theme.Typography
import com.example.receplio.ui.theme.cardBackgroundColor
import com.example.receplio.ui.theme.secondaryColor


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
                    contentDescription = "sandwich",
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(
                modifier = Modifier
                    .padding(5.dp, 10.dp, 0.dp, 0.dp)
                    .fillMaxWidth(.85f),
            )
            {
                Text(text = "Sandwich", style = Typography.h6)
                Row(
                    modifier = Modifier
                        .padding(0.dp, 20.dp, 0.dp, 0.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "27 g Protein", style = Typography.body1)
                    Image(
                        painter =
                        painterResource(id = R.drawable.dote),
                        contentDescription = "dote",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.padding(0.dp, 5.dp, 0.dp, 0.dp)
                    )
                    Text(text = "120 Calories", style = Typography.body1)
                }

            }

            IconButton(
                modifier = Modifier
                    .size(64.dp)
                    .padding(0.dp, 20.dp, 0.dp, 0.dp),
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow_down),
                    contentDescription = "arrow down",
                    Modifier.fillMaxSize(),
                    tint = secondaryColor
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