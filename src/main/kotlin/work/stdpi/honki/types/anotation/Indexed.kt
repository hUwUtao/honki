package work.stdpi.honki.types.anotation

import work.stdpi.honki.types.Column
import work.stdpi.honki.types.IValue

class Indexed(val col: IValue): Column(name = col.name) {
    override val dbType = col.dbType
}