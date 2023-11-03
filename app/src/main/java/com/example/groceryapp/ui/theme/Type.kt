package com.example.groceryapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.groceryapp.R

val Typography = Typography(
    headlineMedium = TextStyle(
        fontSize = 14.sp,
        lineHeight = 30.sp,
        fontWeight = FontWeight(600),
    ),
    headlineSmall = TextStyle(
        fontSize = 14.sp,
        lineHeight = 30.sp,
        fontWeight = FontWeight(600),
        ),
    bodyLarge = TextStyle(
        fontSize = 13.sp,
        fontWeight = FontWeight(400),
        letterSpacing = 0.26.sp,
    ),
    bodyMedium = TextStyle(
            fontSize = 11.sp,
            lineHeight = 21.sp,
            fontWeight = FontWeight(500),
    ),
    labelLarge = TextStyle(
        fontSize = 13.sp,
        lineHeight = 21.sp,
        fontWeight = FontWeight(700),
    ),
)