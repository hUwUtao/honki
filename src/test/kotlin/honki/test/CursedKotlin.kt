package honki.test

class CursedKotlin {
    object SchemaDemoNoRef {
        val cute = 0
        val funny = 1

        fun insertWith(vararg entries: Pair<Any, Any>) {}
    }

    // has to enforce runtime check :((
    fun testWeirdFun() {
        SchemaDemoNoRef.insertWith(
            SchemaDemoNoRef.cute to 5
        )

    }
}