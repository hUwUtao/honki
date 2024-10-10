package work.stdpi.honki.types.number

import work.stdpi.honki.types.Column
import work.stdpi.honki.types.IValue

abstract class InternalInt(name: String, isSerial: Boolean) : Column(name), IValue {
}