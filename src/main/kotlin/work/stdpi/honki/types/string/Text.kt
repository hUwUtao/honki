package work.stdpi.honki.types.string

class Text(name: String, blankPad: Boolean = false) : InternalVarChar(name) {
    override val dbType = if (blankPad) {
        "bpchar"
    } else {
        "text"
    }
}