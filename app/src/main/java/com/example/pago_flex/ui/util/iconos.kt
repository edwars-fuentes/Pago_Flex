package com.example.pago_flex.ui.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Traduce la clave lógica de una insignia (definida en el dominio) a un
 * `ImageVector` de Material Icons. Mantiene el dominio libre de dependencias de UI.
 *
 * Se usan solo iconos del set "core" (siempre disponibles con Material 3); el set
 * "extended" fue descontinuado y no se incluye en el proyecto.
 */
fun iconoDeInsignia(clave: String): ImageVector = when (clave) {
    "check" -> Icons.Filled.CheckCircle
    "llama" -> Icons.Filled.ThumbUp
    "medalla" -> Icons.Filled.Favorite
    "escudo" -> Icons.Filled.Lock
    "trofeo" -> Icons.Filled.Star
    else -> Icons.Filled.CheckCircle
}