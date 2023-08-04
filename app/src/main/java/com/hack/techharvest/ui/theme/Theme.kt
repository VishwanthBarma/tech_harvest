package com.hack.techharvest.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


//private val DarkColorPalette = darkColors(
//        primary = Purple200,
//        primaryVariant = Purple700,
//        secondary = Teal200,
//        background = Color.Black
//)

private val DarkColorPalette = darkColors(
    primary = Color(0xFFBB86FC), // Purple
    primaryVariant = Color(0xFF3700B3), // Deep Purple
    secondary = Color(0xFF03DAC6), // Teal
    background = Color(0xFF121212), // Dark Background
    surface = Color(0xFF1E1E1E), // Dark Surface
    onPrimary = Color.Black, // Text on Primary
    onSecondary = Color.Black, // Text on Secondary
    onBackground = Color.White, // Text on Background
    onSurface = Color.White, // Text on Surface
)


private val LightColorPalette = lightColors(
        primary = Purple500,
        primaryVariant = Purple700,
        secondary = Teal200

        /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun TechHarvestTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
    )
}