package com.example.receplio.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

/*private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200*/

/* Other default colors to override
background = Color.White,
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/

private val ColorPalette = lightColors(
    primary = mainColor,
    primaryVariant = darkMainColor,
    secondary = lightMainColor,
    background=whiteColor
)

@Composable
fun ReceplioTheme(content: @Composable () -> Unit) {
    /*  val colors = if (darkTheme) {
          DarkColorPalette
      } else {
          LightColorPalette
      }*/

    MaterialTheme(
        colors = ColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}