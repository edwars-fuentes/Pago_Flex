package com.example.pago_flex.dominios.modelos

/**
 * Insignia de gamificación.
 *
 * @param icono clave lógica que la UI mapea a un `ImageVector` de Material Icons.
 */
data class Insignia(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val icono: String,
    val obtenida: Boolean
)
