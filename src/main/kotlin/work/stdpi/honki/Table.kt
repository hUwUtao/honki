package work.stdpi.honki

import kotlin.reflect.KClass

abstract class Table<T : Any>(private val c: KClass<T>): AbstractQueryNode() {
    override fun build() {
        c.java.declaredFields.map {
            if (it.type.isPrimitive || it.type == Table::class.java) {

            }
        }
    }
}
