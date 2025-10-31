package com.example.ai37c

fun main() {
    var x: Double = 132.32
    var y: Int = x.toInt()       // 132
    var z: Byte = y.toByte()     // overflow happens

    println("Double value: $x")
    println("Converted to Int: $y")
    println("Converted to Byte: $z (overflow because 132 > 127)")
}
