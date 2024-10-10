package work.stdpi.honki.types.number

/**
 * Literally `double precision`
 */
class Float64(name: String) : InternalFloat(name) {
    override val dbType = "double precision"
}