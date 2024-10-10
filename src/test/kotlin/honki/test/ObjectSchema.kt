package honki.test

import work.stdpi.honki.Table
import work.stdpi.honki.types.anotation.Primary
import work.stdpi.honki.types.number.Int64

object ObjectSchema {
    class Player: Table<Player>(Player::class) {
        val key = Primary(Int64("id", true))
    }
}