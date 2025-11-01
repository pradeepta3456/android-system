package com.example.ai37c

fun main() {

    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(index = 1, element = 20)
    age1.add(5)

    println("Age1 list: $age1")

    var age2 = arrayListOf(1, 20, 5)
    println("Age2 list: $age2")

    var name = arrayListOf("sandis", "ram", "shyam")
    name.add("hari")
    name.add(index = 4, element = "Sita")

    name.remove("shyam")
    name.removeAt(0)

    println("Names list: $name")

    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}

