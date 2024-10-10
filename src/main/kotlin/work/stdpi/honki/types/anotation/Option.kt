package work.stdpi.honki.types.anotation

import work.stdpi.honki.types.Column

class Option(val col: Column): Column(name = col.name) {
    override val dbType = col.dbType
    override val isNullable = true
}