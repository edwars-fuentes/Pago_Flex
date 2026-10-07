package com.example.pago_flex.dominios.modelos

/** Resultado de un pago confirmado, para mostrar el comprobante en la UI. */
data class ResultadoPago(
    val folio: String,
    val monto: Long,
    val medioPago: String,
    val fechaPago: String,
    val mensaje: String
)
