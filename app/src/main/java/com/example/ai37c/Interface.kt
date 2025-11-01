package com.example.ai37c

interface CanGo {
    fun go()
}

interface CanStop {
    fun stop()
}

class Vehicles : CanGo, CanStop {
    val name: String = "Ferrari"

    override fun go() {
        println("vehicles can go")
    }

    override fun stop() {
        println("vehicles can stop")
    }
}

fun main() {
    val vehicles = Vehicles()

    println(vehicles.name)
    vehicles.go()
    vehicles.stop()
}
