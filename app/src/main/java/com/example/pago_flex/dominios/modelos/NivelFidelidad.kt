package com.example.pago_flex.dominios.modelos

/**
 * Nivel de fidelidad derivado del porcentaje de cumplimiento histórico.
 * Se usa para gamificar el historial de pagos del usuario.
 */
enum class NivelFidelidad(val titulo: String, val minimoPorcentaje: Int) {
    BRONCE("Bronce", 0),
    PLATA("Plata", 50),
    ORO("Oro", 75),
    PLATINO("Platino", 90);

    val siguiente: NivelFidelidad?
        get() = entries.getOrNull(ordinal + 1)

    companion object {
        fun desde(porcentaje: Int): NivelFidelidad =
            entries.lastOrNull { porcentaje >= it.minimoPorcentaje } ?: BRONCE
    }
}
