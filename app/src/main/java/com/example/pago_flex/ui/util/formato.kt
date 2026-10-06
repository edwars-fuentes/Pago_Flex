package com.example.pago_flex.ui.util

import java.text.NumberFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

private val localeEs = Locale.forLanguageTag("es-CL")

/** Formatea un monto entero como pesos chilenos, p. ej. `380000` -> `$ 380.000`. */
fun formatearMonto(monto: Long, moneda: String = "CLP"): String {
    val simbolo = if (moneda == "CLP") "$" else moneda
    val nf = NumberFormat.getNumberInstance(localeEs)
    return "$simbolo ${nf.format(monto)}"
}

private val formatoLargo: DateTimeFormatter = DateTimeFormatter.ofPattern("d 'de' MMMM", localeEs)
private val formatoCorto: DateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", localeEs)

/** Convierte una fecha ISO `yyyy-MM-dd` a texto legible; si falla, devuelve el original. */
fun formatearFecha(iso: String?, largo: Boolean = false): String {
    if (iso.isNullOrBlank()) return "—"
    val formatter = if (largo) formatoLargo else formatoCorto
    return runCatching { LocalDate.parse(iso).format(formatter) }.getOrDefault(iso)
}
