package com.example.pago_flex.dominios.modelos

/** Usuario final con sesión ya autenticada (simulada para el MVP). */
data class Usuario(

    val id: String,
    val nombre: String,
    val email: String
)