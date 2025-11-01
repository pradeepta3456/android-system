package com.example.ai37c

fun show(a: Int, b: Int) {
    println("You entered $a and $b")
}

fun add(a: Int, b: Int): Int {
    var sum = 0
    sum = a + b
    return sum
}

fun findMinimumNumber(a: Int, b: Int): Int {
    var minimum = 0
    if (a > b) {
        minimum = b
    } else {
        minimum = a
    }
    return minimum
}

fun main() {
    val a = 25
    val b = 15

    show(a, b)
    val sum = add(a, b)
    println("Sum of the two entered number is $sum")
    val minimum = findMinimumNumber(a, b)
    println("And the smallest between $a and $b is $minimum")
}