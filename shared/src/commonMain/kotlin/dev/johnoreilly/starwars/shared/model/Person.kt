package dev.johnoreilly.starwars.shared.model

import dev.johnoreilly.starwars.fragment.PersonFragment

data class Person(val id: String, val name: String, val homeWorld: String)

fun PersonFragment.mapToModel() = Person(id, name, homeworld.name)