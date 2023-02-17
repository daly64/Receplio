package com.example.receplio.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.receplio.R

val expressWay = FontFamily(Font(R.font.expressway, weight = FontWeight.Normal))
val expressWayBold = FontFamily(Font(R.font.expressway, weight = FontWeight.Bold))

// Set of Material typography styles to start with

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = expressWay,
        fontSize = 16.sp,
        color = secondaryColor,
        letterSpacing = 0.5.sp
    ),
    h6 = TextStyle(
        fontFamily = expressWayBold,
        color = mainTextColor,
        fontSize = 20.sp,
        letterSpacing = 0.15.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)