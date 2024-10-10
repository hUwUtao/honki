# `honki`

A simple ORM for kotlin apps, driven by schema that should be used like a document database DAO, but this one is for
Postgres.

```kotlin
object Player : Table<Player>(Player::class) {
    val id = Primary(Int64("id", isSerial = true))
    /// WIP
    val questOwns = Has<QuestOwn>()
}

object QuestOwn : Table<QuestOwn>(QuestOwn::class) {
    val playerId = Primary(Int64("id", isSerial = true))
    val questId = Primary(Int32("id", isSerial = true))
}

object Quest : Table<Quest>(Quest::class) {
    val id = Primary(Int32("id", isSerial = true))
}

/// WIP

transaction {
    Player.insert {
        Player.id to 3232
    }
}

```

