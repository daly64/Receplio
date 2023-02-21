package com.example.receplio.elements

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.receplio.R


@Composable
fun SquareImage(@DrawableRes Image_id: Int, size: Dp) {
    Card(
        modifier = Modifier.size(size),
        shape = RoundedCornerShape(5.dp),
    ) {
        Image(
            painter =
            painterResource(id = Image_id),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
}

@Preview
@Composable
fun SquareImagePreview() {
    SquareImage(R.drawable.ic_launcher_background, 80.dp)
}