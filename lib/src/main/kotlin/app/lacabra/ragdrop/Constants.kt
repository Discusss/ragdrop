package app.lacabra.ragdrop

import app.lacabra.ragdrop.types.Array
import app.lacabra.ragdrop.types.Boolean
import app.lacabra.ragdrop.types.Map
import app.lacabra.ragdrop.types.Number
import app.lacabra.ragdrop.types.String

object Constants {

    val requirementsRegex = Regex("\\[(.*?)]")

    val defaultTypes: kotlin.collections.Map<kotlin.String, Function1<kotlin.String, Type>> = mapOf(
        "string" to String::create,
        "number" to Number::create,
        "boolean" to Boolean::create,
        "array" to Array::create,
        "map" to Map::create
    )
}