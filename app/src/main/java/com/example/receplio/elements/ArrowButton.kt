package com.example.receplio.elements

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.receplio.R
import com.example.receplio.components.IconButtonModifier
import com.example.receplio.ui.theme.blackColor

@Composable
fun ArrowButton(
    onClick: () -> Unit = {},
    tint: androidx.compose.ui.graphics.Color = blackColor
) {
    IconButton(modifier = IconButtonModifier, onClick = onClick) {
        Icon(
            imageVector = ImageVector
                .vectorResource(id = R.drawable.arrow_down),
            contentDescription = null,
            tint = tint,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
fun ArrowButtonPreview() {
    ArrowButton()
}