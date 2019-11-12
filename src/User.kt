package de.novatec

import java.util.*

data class User(
    val id: UUID = UUID.randomUUID(),
    val firstName: String,
    val lastName: String,
    val age: Int
)

data class UserDTO(
    val firstName: String,
    val lastName: String,
    val age: Int
)