package work.stdpi.honki.types.number

class Int64(name: String, isSerial: Boolean = false) : InternalInt(name, isSerial) {
    override val dbType = "bigint"
}