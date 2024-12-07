package ru.q2l3ntk.tunica.data

internal data class Empolyee(
    val id: Long,
    val photo: String? = null,
    val name: String,
    val surname: String,
    val position: Position
)

enum class Position(val positionName: String) {
    JUNIOR("Junior"),
    MIDDLE("Middle"),
    SENIOR("Senior"),
    ARCHITECT("Architect")
}