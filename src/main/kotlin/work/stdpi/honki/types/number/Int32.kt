package work.stdpi.honki.types.number

class Int32(name: String, isSerial: Boolean = false) : InternalInt(name, isSerial) {
    override val dbType = "interger"
}