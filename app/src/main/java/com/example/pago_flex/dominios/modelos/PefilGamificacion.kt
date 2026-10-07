package com.example.pago_flex.dominios.modelos

/**
 * Resumen gamificado del comportamiento de pago del usuario.
 * Se calcula de forma derivada a partir de su historial de compromisos.
 *
 * @param cumplimientoPorcentaje % de compromisos pagados sobre el total.
 * @param rachaActual pagos al día consecutivos más recientes.
 * @param progresoSiguienteNivel avance (0f..1f) hacia el umbral del siguiente nivel.
 */
data class PerfilGamificacion(
    val nivel: NivelFidelidad,
    val cumplimientoPorcentaje: Int,
    val rachaActual: Int,
    val totalPagados: Int,
    val totalCompromisos: Int,
    val progresoSiguienteNivel: Float,
    val insignias: List<Insignia>
) {
    val insigniasObtenidas: Int get() = insignias.count { it.obtenida }
}
