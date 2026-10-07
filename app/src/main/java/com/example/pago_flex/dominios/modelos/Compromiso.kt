package com.example.pago_flex.dominios.modelos

/**
 * Compromiso de pago de un usuario final con una empresa cliente de PagoFlex.
 *
 * @param monto valor en pesos (entero, sin decimales) para evitar errores de punto flotante.
 * @param fechaVencimiento fecha en formato ISO `yyyy-MM-dd`.
 * @param fechaPago fecha en que se pagó, o `null` si aún no se paga.
 */
data class Compromiso(
    val id: String,
    val empresaId: String,
    val empresaNombre: String,
    val concepto: String,
    val monto: Long,
    val moneda: String,
    val fechaVencimiento: String,
    val estado: EstadoCompromiso,
    val fechaPago: String?
) {
    val pagable: Boolean get() = estado != EstadoCompromiso.PAGADO
}
