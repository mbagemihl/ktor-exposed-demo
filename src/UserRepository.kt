package de.novatec

import org.jetbrains.exposed.sql.Table

object Users : Table() {
    val id = uuid("id").primaryKey()
    val firstname = text("firstname")
    val lastname = text("lastname")
    val age = integer("age")
}