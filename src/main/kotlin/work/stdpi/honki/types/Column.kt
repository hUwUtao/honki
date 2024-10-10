package work.stdpi.honki.types

abstract class Column(override val name: String) : IColumn {
    open val isNullable = false
    open val isPrimary = false
}