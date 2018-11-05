package de.hska.customer.entity

import javax.validation.constraints.Pattern

data class Customer(
    @get:Pattern(regexp = ID_PATTERN)
    val id: String,
    @get:Pattern(regexp = NAME_PATTERN)
    val vorname: String,
    @get:Pattern(regexp = NAME_PATTERN)
    val nachname: String,
    val adresse: String,
    @get:Pattern(regexp = GEHALT_PATTERN)
    val gehalt: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Customer
        return id == other.id
    }

    override fun hashCode(): Int = id.hashCode()


    companion object {
        private
        const val HEX_PATTERN = "[\\dA-Fa-f]"
        const val ID_PATTERN =
            "$HEX_PATTERN{8}-$HEX_PATTERN{4}-$HEX_PATTERN{4}-" +
                    "$HEX_PATTERN{4}-$HEX_PATTERN{12}"

        const val NAME_PATTERN = "[A-ZÄÖÜ][a-zäöüß]+"
        const val GEHALT_PATTERN = "[0-9]+"
    }
}
