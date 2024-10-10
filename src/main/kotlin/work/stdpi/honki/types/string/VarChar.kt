package work.stdpi.honki.types.string

class VarChar(name: String, limit: UInt, private val kind: VarCharKind = VarCharKind.CharacterVarying) : InternalVarChar(name) {
    enum class VarCharKind {
        CharacterVarying, VarChar
    }

    override val dbType = when (kind) {
        VarCharKind.CharacterVarying -> "character varying"
        VarCharKind.VarChar -> "varchar"
    }
}