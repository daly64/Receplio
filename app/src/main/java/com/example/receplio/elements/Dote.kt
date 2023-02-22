package com.example.receplio.elements

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.receplio.R
import com.example.receplio.ui.theme.mainColor

@Composable
fun Dote(tint: androidx.compose.ui.graphics.Color) {
    Icon(
        imageVector = ImageVector
            .vectorResource(id = R.drawable.dote),
        contentDescription = null, tint = tint
    )
}

@Preview
@Composable
fun DotePreview() {
    Dote(mainColor)
}