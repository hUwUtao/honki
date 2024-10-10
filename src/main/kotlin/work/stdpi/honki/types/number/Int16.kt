package work.stdpi.honki.types.number

class Int16(name: String, isSerial: Boolean = false): InternalInt(name, isSerial) {
    override val dbType = "smallint"
}