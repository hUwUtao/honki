package work.stdpi.honki.types.anotation

import work.stdpi.honki.types.Column

class Primary(val col: Column): Column(name = col.name) {
    override val dbType = col.dbType
    override val isPrimary = true
}