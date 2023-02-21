package com.example.receplio.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.receplio.R
import com.example.receplio.ui.theme.Typography

@Composable
fun Label() {
    Column(
        modifier = Modifier
            .padding(5.dp, 10.dp, 0.dp, 0.dp)
            .fillMaxWidth()
            .height(100.dp),
    )
    {
        Text(text = "Sandwich", style = Typography.h6)
        Row(
            modifier = Modifier
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
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
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun LabelPreview() {
    Label()
}