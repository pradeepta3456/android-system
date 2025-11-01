package com.example.ai37c

fun main() {
    class Animal {
        var name: String? = null
        var type: String? = null

        constructor(name: String?, type: String?) {
            this.name = name
            this.type = type
        }
    }

    var firstAnimal = Animal(name = "murphy", type = "Dog")
    firstAnimal.name = "Luccy"
    firstAnimal.type = "Dog"
    println("The animal is ${firstAnimal.type} and its name ${firstAnimal.name}")
}
