package work.stdpi.honki.types.number

import work.stdpi.honki.types.Column
import work.stdpi.honki.types.IValue

class Double(name: String, kind: DoubleKind = DoubleKind.Decimal) : Column(name), IValue {
    override val dbType = if (kind == DoubleKind.Numeric) {
        "numeric"
    } else {
        "decimal"
    }

    enum class DoubleKind {
        Decimal,
        Numeric
    }
}