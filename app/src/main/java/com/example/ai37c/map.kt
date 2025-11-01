package com.example.ai37c

fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("All keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")
    println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
}

fun main() {
    map()
}
