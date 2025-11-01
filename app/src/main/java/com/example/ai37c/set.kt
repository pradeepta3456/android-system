package com.example.ai37c

fun set() {
    val numbers = setOf(1, 2, 3, 4)
    for(element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

fun main() {
    set()
}
