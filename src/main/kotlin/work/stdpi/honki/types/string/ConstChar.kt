package work.stdpi.honki.types.string

import work.stdpi.honki.types.Column
import work.stdpi.honki.types.IValue

class ConstChar(name: String, size: UInt, kind: ConstCharKind = ConstCharKind.Char) : Column(name), IValue {
    enum class ConstCharKind {
        Character, Char, BpChar
    }

    override val dbType = when(kind) {
        ConstCharKind.Character -> "character"
        ConstCharKind.Char -> "char"
        ConstCharKind.BpChar -> "bpchar"
    }
}