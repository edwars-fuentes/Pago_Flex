package com.example.pago_flex.dominios.modelos

/** Estado de un compromiso de pago. */
enum class EstadoCompromiso {
    /** Al día, aún no vence o vence pronto. */
    PENDIENTE,

    /** Ya fue pagado. */
    PAGADO,

    /** Venció sin pago (en mora). */
    VENCIDO;

    companion object {
        fun desde(valor: String?): EstadoCompromiso =
            entries.firstOrNull { it.name.equals(valor, ignoreCase = true) } ?: PENDIENTE
    }
}
